package Logica;

import java.util.LinkedList;
import java.util.List;

import Logica.Enemigos.Enemigo;
import Logica.Plataformas.Plataforma;
import Logica.PowerUps.PowerUp;

public class Nivel {
    protected List<Enemigo> listaEnemigos;
    protected List<Plataforma> listaPlataformas;
    protected List<PowerUp> listaPowerUps;
    
    protected Mario mario;

    public Nivel(Mario mario) {
        listaEnemigos = new LinkedList<Enemigo>();
        listaPlataformas = new LinkedList<Plataforma>();
        listaPowerUps = new LinkedList<PowerUp>();
        this.mario = mario;
    }

    // Getters y Setters para Enemigos
    public List<Enemigo> getListaEnemigos() {
        return listaEnemigos;
    }

    public void setEnemigo(Enemigo enemigo) {
        listaEnemigos.add(enemigo);
    }

    public void setListaEnemigos(List<Enemigo> listaEnemigos) {
        this.listaEnemigos = listaEnemigos;
    }

    // Getters y Setters para Plataformas
    public List<Plataforma> getListaPlataformas() {
        return listaPlataformas;
    }

    public void setPlataforma(Plataforma plataforma) {
        listaPlataformas.add(plataforma);
    }

    public void setListaPlataformas(List<Plataforma> listaPlataformas) {
        this.listaPlataformas = listaPlataformas;
    }

    // Getters y Setters para PowerUps
    public List<PowerUp> getListaPowerUps() {
        return listaPowerUps;
    }

    public void setPowerUp(PowerUp powerUp) {
        listaPowerUps.add(powerUp);
    }

    public void setListaPowerUps(List<PowerUp> listaPowerUps) {
        this.listaPowerUps = listaPowerUps;
    }

    // Getters y Setters para Mario
    public Mario getMario() {
        return mario;
    }

    public void setMario(Mario mario) {
        this.mario = mario;
    }

	public Entidad[] getListaEntidades() {
		// TODO Auto-generated method stub
		return null;
	}
}
