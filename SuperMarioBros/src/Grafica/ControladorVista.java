package Grafica;

import javax.swing.JPanel;               
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;    
import java.awt.event.KeyAdapter;         
import java.awt.event.KeyEvent;           
import javax.swing.Timer;                 
import java.awt.Graphics;                
import java.awt.Color;                   
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Inputs.Jugador;
import Logica.Entidad;
import Logica.Mario;
import Logica.Nivel;
import Logica.Enemigos.Enemigo;
import Logica.Plataformas.Plataforma;
import Logica.PowerUps.PowerUp;
import Visitantes.ColisionVisitor;
import Visitantes.MarioColisionVisitor;

public class ControladorVista extends JPanel implements ActionListener, Runnable {
    private Jugador jugador;             // Instancia del jugador
    private String rutaImagen;
    protected JFrame ventana;


    protected Observer obs_mario1;
    protected ObserverEntidades obs_entidades;
    protected Nivel nivel_actual;
    
    //protected 
    public ControladorVista(Jugador jugador,JFrame ventana) {
        this.jugador = jugador; // Inicializa el jugador
        rutaImagen = "./src/Assets/Escenario/bkgd_main.png";
        setFocusable(true);
        this.setLayout(null);
        escucharTeclado();
        this.ventana = ventana;
    }

    public void setObserverMario(Observer obs_mario) {
    	this.obs_mario1 = obs_mario;
    }
    
    public void setObserverEntidades(ObserverEntidades obs_entitad) {
    	this.obs_entidades = obs_entitad;
    }
    
    public void iniciar() {
    	
    	Thread hiloJuego = new Thread(this); 
        hiloJuego.start(); 
    }

    public void escucharTeclado() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A: // Tecla A para moverse a la izquierda
                        jugador.moverIzquierda(true);
                        break;
                    case KeyEvent.VK_D: // Tecla D para moverse a la derecha
                        jugador.moverDerecha(true);
                        break;
                    case KeyEvent.VK_W:
                    	jugador.saltar();
                    	break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A: 
                    	jugador.moverIzquierda(false);
                    	break;                // Detener el movimiento cuando se suelta la tecla A
                    case KeyEvent.VK_D: // Detener el movimiento cuando se suelta la tecla D
                    	jugador.moverDerecha(false);
                        break;
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar fondo
        ImageIcon imagen = new ImageIcon(rutaImagen);
        g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
        
        // Dibujar el jugador
        /*if (jugador != null) {
            jugador.dibujar(g, this);
        }*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint(); // Actualizar el dibujo
    }
    
    public void refrescar() {
		ventana.revalidate();
		ventana.repaint();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// Bucle principal del juego
        while (true) {
            MarioColisionVisitor colision = new MarioColisionVisitor(jugador.getMario());
            //System.out.println(nivel_actual != null);;
        	//jugador.actualizarPosicion();
        	if (nivel_actual != null) {
        		Mario.getInstancia().MovimientoMario();
        		//System.out.println(Mario.getInstancia().getVelocidadY());
        		repaint();
        		for (Enemigo enemigo : nivel_actual.getListaEnemigos()) {
        			/*if (checkCollision(nivel_actual.getMario(), enemigo)) {
        				enemigo.accept(colision);//Acepta un visitante concreto mariocolision
        			}*/
        			jugador.getMario().accept(colision);
        			colision.visit(enemigo);
        			enemigo.mover();
                    //enemigo.accept(colision);//Acepta un visitante concreto mariocolision(Este iria dentro del if)    
        		}
        		
        		
        		
                for (Plataforma plataforma : nivel_actual.getListaPlataformas()) {
                	colision.visit(plataforma);
                	/*if (checkCollision(nivel_actual.getMario(), plaforma)) {
    					plaforma.accept(colision);//Acepta un visitante concreto mariocolision
    				}*/
                	//plaforma.accept(colision); //Acepta un visitante concreto mariocolision  
                	
                }
                
                /*falta powerups factory y hacer el for*/
                for (PowerUp power_up : nivel_actual.getListaPowerUps()) {
           
                	colision.visit(power_up);
                	/*if (checkCollision(nivel_actual.getMario(), plaforma)) {
    					plaforma.accept(colision);//Acepta un visitante concreto mariocolision
    				}*/
                	//plaforma.accept(colision); //Acepta un visitante concreto mariocolision                	
                }
                
                
            }else {
            	System.out.print("No esta llamando boludo");
            }
            // Redibujar todo
            repaint();

            // Pausar el bucle durante un pequeño intervalo
            try {
                Thread.sleep(16); // 16 ms para un frame rate aproximado de 60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
	/*
	public boolean checkCollision(Entidad e1, Entidad e2) {
		return false;
		//Implentar cuando dos cajas se chocan
	}*/
	
	public void setNivel(Nivel nivel_actual) {
		// TODO Auto-generated method stub
		this.nivel_actual = nivel_actual;
	}
}
