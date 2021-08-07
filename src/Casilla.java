
public class Casilla {

	static final String SIMBOLO_DE_CASILLA_VACIA = "__";
	private Ficha ficha;

	public Casilla() {
		this.setFicha(null);
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
	public String toString() {
		if(this.estaVacia()) {
			return SIMBOLO_DE_CASILLA_VACIA;
		}else {
			return ficha.toString(); 
		}
	}
}

