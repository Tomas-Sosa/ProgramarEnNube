package Logica;

public abstract class ColisionVisitor {
	public abstract void visitMario(Mario mario);
	public abstract void visitEnemigo(Enemigo enemigo);
	public abstract void visitPowerUp(PowerUp power_up);
	public abstract void visitPlataforma(Plataforma plataforma);
}
