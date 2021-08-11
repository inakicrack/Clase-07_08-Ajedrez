
public class Alfil extends Ficha{
	
	final static String LETRA_DE_ALFIL = "A";

	public Alfil (String color){
		//Obligado siempre llamar a super antes que el resto de las líneas
		super(color);
		this.setLetra( Alfil.LETRA_DE_ALFIL);
	}

	@Override
	public boolean puedeMoverAqui(Tablero tablero, Posicion posicion) {
		return false;
	}	
}
