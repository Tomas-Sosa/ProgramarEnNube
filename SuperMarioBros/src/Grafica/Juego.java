package Grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;    // Importar ActionListener
import javax.swing.JFrame;

import Inputs.Jugador;                   // Importar la clase Jugador
import Logica.Mario;
import Logica.Nivel;
import Logica.NivelBuilder;
import Logica.Enemigos.Enemigo;
import Logica.Fabricas.FabricaElementos;
import Logica.Fabricas.FabricaSpritesBase;
import Logica.Fabricas.FabricaSprites;
import Logica.Plataformas.Plataforma;
import Logica.PowerUps.PowerUp;

public class Juego implements ActionListener{
	
	protected FabricaSpritesBase factory_spr;
    protected FabricaElementos factory_elem;
    protected NivelBuilder gen_nivel;
    protected Nivel nivel_actual;
    protected JFrame ventana;
    
    protected ObserverEntidades observer_mario;

    private Jugador jugador;             // Instancia del jugador
    private ControladorVista ctrl_vista; // Instancia del controlador vista
    
    //Constantes
    public  final int HEIGHT = 320; //16 bloques
    public  final int WIDTH = 960; // 32 bloques

    public Juego() {
        // Inicializa el jugador
        jugador = new Jugador(); // Posición inicial
        // Inicializa el controlador vista con el jugador
        ctrl_vista = new ControladorVista(jugador,ventana);
        
        // Inicia las fábricas
        factory_spr = new FabricaSprites("Assets/");
        factory_elem = new FabricaElementos(factory_spr);
        
        // Inicia el generador de nivel
        gen_nivel = new NivelBuilder(factory_elem,jugador.getMario());
        
        // Establecer tamaño del panel
        //setPreferredSize(new java.awt.Dimension(WIDTH, HEIGHT)); // Cambia según necesites
    }
    
    public void iniciar() {
        gen_nivel.buildEntidades();
        
        nivel_actual = gen_nivel.getNivel();
        
        // Crear y configurar la ventana
        ventana = new JFrame("Mi Juego");
        ventana.add(ctrl_vista); // Agregar el panel controlador
        ventana.pack(); // Ajustar tamaño de ventana al panel
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setSize(WIDTH,HEIGHT);
        ctrl_vista.requestFocusInWindow(); // Solicitar foco
        
        registrarObservers(nivel_actual);
        ctrl_vista.setNivel(nivel_actual);
        ctrl_vista.iniciar();
    }
    
    protected void registrarObservers(Nivel nivel_actual) {
		registrarObserverMario(jugador.getMario());
		registrarObserverEnemigos(nivel_actual);
		registrarObserverPlataforma(nivel_actual);
		registrarObserverPowerUp(nivel_actual);
	}
	
	protected void registrarObserverMario(Mario mario) {
		ObserverEntidades observer = new ObserverEntidades(mario);
		mario.setObserver(observer);
		ctrl_vista.add(observer);
	}
	
	protected void registrarObserverEnemigos(Nivel nivel_actual) {
		for(Enemigo enemigo :nivel_actual.getListaEnemigos()) {
			ObserverEntidades observer = new ObserverEntidades(enemigo);
			enemigo.setObserver(observer);
			ctrl_vista.add(observer);
		}
	}
	
	protected void registrarObserverPlataforma(Nivel nivel_actual) {
		for(Plataforma plataforma :nivel_actual.getListaPlataformas()) {
			ObserverEntidades observer = new ObserverEntidades(plataforma);
			plataforma.setObserver(observer);
			ctrl_vista.add(observer);
		}
	}
	
	protected void registrarObserverPowerUp(Nivel nivel_actual) {
		for(PowerUp powerup :nivel_actual.getListaPowerUps()) {
			ObserverEntidades observer = new ObserverEntidades(powerup);
			powerup.setObserver(observer);
			ctrl_vista.add(observer);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Que hace esto
	}
	
}