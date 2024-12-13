package Visitantes;

import Logica.Mario;
import Logica.Enemigos.Enemigo;
import Logica.Plataformas.Plataforma;
import Logica.PowerUps.PowerUp;

public abstract class ColisionVisitor{
	public abstract void visit(Mario mario);
	public abstract void visit(Enemigo enemigo);
	public abstract void visit(PowerUp power_up);
	public abstract void visit(Plataforma plataforma);
}
