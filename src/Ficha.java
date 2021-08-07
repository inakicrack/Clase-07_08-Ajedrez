
public abstract class Ficha {

	boolean color;
	final String letra;
	
	public Ficha(boolean colorF, String letraF) {
		this.color = colorF;
		this.letra = letraF;
	}
	
	public String getColor() {
		return this.colorToString();
	}
	
	public String getLetra() {
		return this.letra;
	}
	
	public void setColor(boolean nuevoC) {
		this.color = nuevoC;
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

}