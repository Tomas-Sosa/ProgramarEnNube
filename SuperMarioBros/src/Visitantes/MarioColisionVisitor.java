package Visitantes;

import Logica.Mario;
import Logica.Enemigos.Enemigo;
import Logica.Estados.Fuego;
import Logica.Plataformas.Plataforma;
import Logica.PowerUps.PowerUp;

public class MarioColisionVisitor extends ColisionVisitor{
	
	protected Mario mario;
	
	public MarioColisionVisitor(Mario mario) {
		this.mario = mario;
	}
	@Override
	public void visit(Mario mario) {
		// Mario no choca con el mismo.
	}

	@Override
	public void visit(Enemigo enemigo) {
		if(enemigo.esColisionable() && mario.checkCollision(enemigo)) {
			System.out.println("Mario ha chocado con un enemigo");
			mario.colisionar(enemigo);
			mario.minisalto();
		}
	}

	@Override
	public void visit(PowerUp power_up) {
		if(power_up.esColisionable() && mario.checkCollision(power_up)) {
			power_up.setColisionable(false);
			System.out.println("Mario ha chocado con un powerup");
			mario.colisionar(power_up);
		}
	}

	
	
	
	
	@Override
	public void visit(Plataforma plataforma) {
		if(plataforma.esColisionable() && mario.checkCollision(plataforma)) {
			System.out.println("Mario ha chocado con un plataforma");
			
			int chocadodesdearriba = plataforma.getHitbox().getBottom() -  mario.getHitbox().getTop();//en valor absoluto
			int chocadodesdeabajo = mario.getHitbox().getBottom() - plataforma.getHitbox().getTop(); //en valor absoluto
			int chocadodesdeizquierda = plataforma.getHitbox().getRight() - mario.getHitbox().getLeft();//en valor absoluto
			int chocadodesdederecha = mario.getHitbox().getRight() - plataforma.getHitbox().getLeft();//en valor absoluto
			boolean choquearriba = true;
			boolean choqueabajo = true; //probablemente se necesiten borrar estas 4 booleanos.
			boolean choqueizquierda = true;
			boolean choquederecha = true;
			
			//colision desde arriba
			if((choquearriba && chocadodesdearriba > chocadodesdeizquierda && chocadodesdearriba > chocadodesdederecha)){
				mario.setY(plataforma.getY()-16);
				mario.setX(mario.getX());
				mario.setVelocidadY(0);
				mario.setSaltando(false);
				//choquearriba = false;
			//	mario.ChocaPlataformaDesdeArriba(plataforma);
			}
			//colision desde abajo
			else if(choqueabajo && chocadodesdeabajo > chocadodesdeizquierda && chocadodesdeabajo > chocadodesdederecha ) {
				mario.setY(plataforma.getY()+16);
				mario.setVelocidadY(0);
				mario.setSaltando(false);
				//choqueabajo = false;
				//mario.ChocaPlataformaDesdeAbajo(plataforma);
			}
			//colision desde izuqierda
			else if( choqueizquierda && chocadodesdeizquierda > chocadodesdearriba && chocadodesdeizquierda > chocadodesdeabajo) {
				mario.setX(plataforma.getX()-16);
	
					//mario.setY(mario.getY() + mario.getVelocidadY() -1 ); se suponge que esto reduce un bug cuando te chocas latermente con una pared pero anda mal
				mario.setVelocidadX(0);
				//choqueizquierda = false;
				//mario.ChocaPlataformaDesdeIzquierda(plataforma);
				
			}
			//colision desde derecha
			else if(choquederecha  && chocadodesdederecha > chocadodesdearriba && chocadodesdederecha > chocadodesdeabajo) {
				mario.setX(plataforma.getX()+16);
		
					//mario.setY(mario.getY() + mario.getVelocidadY() -1 );
				mario.setVelocidadX(0);
				//choquederecha = false;
				//mario.ChocaPlataformaDesdeDerecha(plataforma);
			}
		
		}
	}
	
}
