
public class Caballo extends Ficha{

	final static String LETRA_DE_CABALLO = "C";

	public Caballo (String color){
		//Obligado siempre llamar a super antes que el resto de las líneas
		super(color);
		this.setLetra(Caballo.LETRA_DE_CABALLO);
	}	

	@Override
	public boolean puedeMoverAqui(Tablero tablero, Posicion posicion) {
		return false;
	}	
}
