
public class Peon extends Ficha{

	final static String LETRA_DE_PEON = "P";

	public Peon (String color){
		//Obligado siempre llamar a super antes que el resto de las líneas
		super(color);
		this.setLetra( Peon.LETRA_DE_PEON);
	}

	@Override
	public boolean puedeMoverAqui(Tablero tablero, Posicion posicion) {
		return false;
	}	
}

