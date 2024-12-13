package Logica.Estados;

import Logica.Mario;
import Logica.Enemigos.Enemigo;

public interface MarioStates {
	public abstract void getChampi(Mario mario); 
    public abstract void getFlor(Mario mario); 
    public abstract void getEstrella(Mario mario); 
    public abstract void dañado(Mario mario); 
    public abstract void muerto(Mario mario);
    //public abstract void obtainPreState(MarioStates state);
    public abstract void update(Mario mario);
	public abstract void colisionar(Enemigo enemigo);
}
