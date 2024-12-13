package Visitantes;

import Logica.Mario;
import Logica.Enemigos.Enemigo;
import Logica.Plataformas.Plataforma;
import Logica.PowerUps.PowerUp;

public class ColisionVisitorEnemigo extends ColisionVisitor{
	protected Enemigo enemigo;

	public ColisionVisitorEnemigo(Enemigo enemigo){
		this.enemigo = enemigo;
	}
	
	@Override
	public void visit(Mario mario) {
		if(enemigo.checkCollision(mario))
		System.out.println("Enemigo ha chocado con mario");
	}

	@Override
	public void visit(Enemigo enemigo) {
		
		System.out.println("Enemigo ha chocado con otro Enemigo");
	}

	@Override
	public void visit(PowerUp power_up) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Plataforma plataforma) {
		// TODO Auto-generated method stub
		System.out.println("Enemigo ha chocado con un Plataforma");
	}

}
