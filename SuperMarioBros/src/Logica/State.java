package Logica;

public abstract class State {
	public abstract void colisionarConPowerUp(Mario mario,PowerUp power_up);
	public abstract void colisionarConEnemigo(Mario mario,Enemigo enemigo);
	public abstract void colisionarConPlataforma(Mario mario,Plataforma plataforma);
}
