
public class Casilla {

	private Ficha ficha;

	public 

	public Casilla(Ficha ficha) {
		this.setFicha(null) = ficha;
	}

	public void asignarFichaACasilla (Ficha ficha) {
		this.setFicha(ficha);
	}

	public void borrarFichaDeCasilla() {
		this.setFicha(null);
	}

	public boolean estaVacia () {
		Ficha fichaEnLaCasilla = this.getFicha();
		if (fichaEnLaCasilla == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tieneFicha () {
		Ficha fichaEnLaCasilla = this.getFicha();
		if (fichaEnLaCasilla == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public Ficha getFicha () {
		return this.ficha;	
	}
	public void setFicha (Ficha nuevaF) {
		this.ficha = nuevaF;
	}
	public String toString() ?? //Debes poder detectar si esta vacia para mostrar la letra de casilla vacia o la letra de la ficha
	
}

}

