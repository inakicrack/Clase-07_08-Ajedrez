
public class Rey extends Ficha{

	final static String LETRA_DE_REY = "R";

	public Rey (String color){
		//Obligado siempre llamar a super antes que el resto de las líneas
		super(color);
		this.setLetra( Rey.LETRA_DE_REY);
	}

	@Override
	public boolean puedeMoverAqui(Tablero tablero, Posicion posicion) {
		return false;
	}	
}
