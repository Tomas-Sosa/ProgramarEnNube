package Logica;
import Datos.Coordenada;
import Datos.Parseo;
import Datos.Puntaje;
import Grafica.Sprite;
import Logica.Fabricas.FabricaSpritesBase;
import Logica.Plataformas.Plataforma;
import Logica.PowerUps.PowerUp;
import Visitantes.ColisionVisitor;
import Logica.Enemigos.Enemigo;
import Logica.Estados.*;
import Logica.Fabricas.FabricaSprites;

public class Mario extends Entidad implements MarioStates {
    protected MarioStates estado;
    protected boolean Saltando = false;
    protected Puntaje puntaje;
    protected int VelocidadX = 0;
    protected int VelocidadY = 0;
    private static Mario instanciaMario ;
    protected boolean isMovingLeft;
    protected boolean isMovingRight;
    private  int Gravedad = 1;
    private  int SaltoDistancia = -13;  // Fuerza del salto
    
    // Constructor privado
    public Mario(Coordenada coord,Sprite spr,int ancho, int alto) {
        super(coord,spr,ancho, alto); // Inicializa la coordenada en el constructor
        this.estado = new Normal();  // Estado predeterminado
        this.puntaje = new Puntaje(0);  // Inicializar puntaje a 0
    }

    // Método estático que retorna la única instancia de Mario (Singleton)
    public static Mario getInstancia() {
        if (instanciaMario == null) {
        	FabricaSpritesBase fs = new FabricaSprites("Assets/");
        	Sprite spr = fs.getMario();
            instanciaMario = new Mario((Parseo.PosicionInicialMario()),spr,16,16); 
        }
        
        return instanciaMario;
    }
    
    // Método para mostrar detalles de Mario
    public void mostrarDetalles() {
        System.out.println("Soy Mario en la posición: (" + coordenada.getX() + ", " + coordenada.getY() + ")");
    }
    
	public void setPuntaje(Puntaje puntaje) {
		this.puntaje = puntaje;
	}
	
	public Puntaje getPuntaje() {
		return puntaje;
	}
	
	public MarioStates getState() {
		return estado;
	}
	
	
	
	public void setState(MarioStates estado) {
		this.estado = estado;
	}
	
	public void accept(ColisionVisitor visitor) {
		visitor.visit(this);
	}
	public void minisalto() {
		VelocidadY = -9;
		
	}
	public void saltar() {
		if(!Saltando) {
			Saltando = true;
			VelocidadY = SaltoDistancia;
		}
	}
	public boolean isSaltando() {
		return Saltando || VelocidadY != 0;
	}
	public int getVelocidadY() {
		return VelocidadY;
	}	
	public int getVelocidadX() {
		return VelocidadX;
	} 
	public void setVelocidadY(int i) {
		VelocidadY = i;
	}
	public void setVelocidadX(int i) {
		VelocidadX = i;
	}
	public void setSaltando(boolean b) {
		Saltando = b;
	}

	public void traza() {
		System.out.println("Soy el mismo hilo boludo "+ Thread.currentThread().getName());
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getChampi(Mario mario) {
		estado.getChampi(this);
	}

	@Override
	public void getFlor(Mario mario) {
		estado.getFlor(this);
	}

	@Override
	public void getEstrella(Mario mario) {
		estado.getEstrella(this);
	}
  
	@Override
	public void dañado(Mario mario) {
		estado.dañado(this);
	}

	@Override
	public void muerto(Mario mario) {
		estado.muerto(this);
	}

	@Override
	public void colisionar(Enemigo enemigo) {
		enemigo.colisionar(this);
		estado.update(this);
	}

	@Override
	public void colisionar(PowerUp power_up) {
		power_up.colisionar(this);
		estado.update(this);
	}

	@Override
	public void colisionar(Plataforma plataforma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colisionar(Mario mario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Mario mario) {
		// TODO Auto-generated method stub
	}
	public void setIzquierda(boolean b) {
		isMovingLeft = b;
		//System.out.println("izquierda test"); hasta aaca llega
	}
	public void setDerecha(boolean b) {
		isMovingRight = b;
	}	
		
    public void MovimientoMario() {
        // Movimiento horizontal
        if (isMovingLeft && !isMovingRight) {
            VelocidadX = -4;
          //  System.out.println("izquierda test"); hasta aca llega
        } else if (isMovingRight && !isMovingLeft) {
            VelocidadX = 4;
        } else {
            VelocidadX = 0;  // Se detiene el movimiento si no hay teclas presionadas
        }
        VelocidadY = VelocidadY + Gravedad;
        if(VelocidadY > 10)
        	VelocidadY = 10;
        
        Coordenada coord = getInstancia().getCoordenada();
        coord.setX(coord.getX() + VelocidadX);
        if (VelocidadY <10) 
        	coord.setY(coord.getY() + VelocidadY);
        else
        	coord.setY(coord.getY() + 10);
        
        
        if (this.getCoordenada().getY() >= 320) {
            this.getCoordenada().setY(320); 
            VelocidadY = 0;
            Saltando = false;  // Permitir que Mario vuelva a saltar
        }
        this.observer.actualizar();
    
	
	
       
	
    }
	
	
	
	
	
	
	
	
}
