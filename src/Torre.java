
public class Torre extends Ficha{

	final static String LETRA_DE_TORRE = "T";

	public Torre (String color){
		//Obligado siempre llamar a super antes que el resto de las líneas
		super(color);
		this.setLetra( Torre.LETRA_DE_TORRE);
	}

	@Override
	public boolean puedeMoverAqui(Tablero tablero, Posicion posicion) {
		return false;
	}	
}
