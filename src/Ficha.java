import MisExcepciones.ColorInvalidoDeFichaRTE;

public abstract class Ficha {

	private boolean color;
	private String letra;
	
	public Ficha(String colorF) {
		this.setColor(colorF);
		//Definición forzosa por culpa de un error
		this.letra = "  ";
	}
	
	public String getColor() {
		return this.colorToString();
	}
	
	public String getLetra() {
		return this.letra;
	}
	
	public void setColor(String nuevoC) {
		if(nuevoC == "NEGRO") {
			this.color = true;
		}else {
			if(nuevoC == "BLANCO") {
				this.color = false;
			}else {
				throw new ColorInvalidoDeFichaRTE("Se está intentado meter un color no válido a las fichas");
			}
		}
	}
	
	protected void setLetra(String nuevaL) {
		this.letra = nuevaL;
	}

	private String colorToString () {
		if (color == false) {
			return "B";
		} else {
			return "N";
		}
	}
	
	private String mostrarFicha() {
		String cadena = "";
		cadena += this.letra + this.colorToString();
        return cadena;
	}

	abstract public boolean puedeMoverAqui(Tablero tablero, Posicion posicion);
	
	public String toString() {
		return this.mostrarFicha();
	}
}