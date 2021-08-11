
public class Reina extends Ficha{

	final static String LETRA_DE_REINA = "Q";

	public Reina (String color){
		//Obligado siempre llamar a super antes que el resto de las líneas
		super(color);
		this.setLetra( Reina.LETRA_DE_REINA);
	}

	@Override
	public boolean puedeMoverAqui(Tablero tablero, Posicion posicion) {
		return false;
	}	
}
