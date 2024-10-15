package Logica;
import Datos.Puntaje;
import Grafica.Sprite;

public class Mario extends Entidad {
    protected State estado;
    protected Puntaje puntaje;
    protected static Mario instancia_mario;  // Instancia única de Mario

    // Constructor privado
    private Mario(Coordenada coord,Sprite str,int ancho, int alto) {
        super(coord,str,ancho, alto); // Inicializa la coordenada en el constructor
        this.estado = new Normal();  // Estado predeterminado
        this.puntaje = new Puntaje(0);  // Inicializar puntaje a 0
    }

    // Método estático que retorna la única instancia de Mario (Singleton)
    public static Mario getInstancia(Coordenada coord) {
        if (instancia_mario == null) {
            instancia_mario = new Mario(coord,new Sprite(""),32, 32); // Usar coordenadas al crear la instancia
        } else {
            instancia_mario.coordenada = coord; // Actualiza la coordenada si ya existe
        }
        return instancia_mario;
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
	
	public State getState() {
		return estado;
	}
	
	public void setState(State estado) {
		this.estado = estado;
	}
	public void accept(ColisionVisitor visitor) {
		visitor.visitMario(this);
	}

	@Override
	public void colisionar(Entidad entidad) {
		// TODO Auto-generated method stub
		MarioColisionVisitor visitor = new MarioColisionVisitor(this);
		entidad.accept(visitor);
	}
	
	public void mover(int dx) {
        // Obtiene la coordenada actual de la hitbox
        Coordenada coord = this.getCoordenada();
        // Actualiza la coordenada X
        coord.setX(coord.getX() + dx);
        System.out.println("Mario se ha movido a la posición X: " + coord.getX());
    }
	
	public void detener(int dx) {
		System.out.println("Mario se ha detenido ");
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isColisionCheck(Entidad ente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipo() {
        return "Mario";
    }
}
