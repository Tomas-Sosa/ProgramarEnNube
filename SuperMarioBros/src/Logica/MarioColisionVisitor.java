package Logica;

public class MarioColisionVisitor extends ColisionVisitor{
	
	protected Mario mario;
	
	public MarioColisionVisitor(Mario mario) {
		this.mario = mario;
	}
	@Override
	public void visitMario(Mario mario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitEnemigo(Enemigo enemigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitPowerUp(PowerUp power_up) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitPlataforma(Plataforma plataforma) {
		// TODO Auto-generated method stub
		
	}

}
