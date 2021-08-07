
public class Rey extends Ficha{

	final static String LETRA_DE_REY = "R";

	public Rey (Posicion posicion, String color) {
			//Si color = “NEGRA”, ya sabe lo que tiene que valer el atributo valor
			//Si color = “BLANCA”, ya sabes…
			//Si no es ninguno de los dos, lanza una excepcion de Color invalido
	//Cada clase va a tener este pedazo de codigo ( traducir de String aboolean) a ver si descubres que funcione en todos lados escribiendolo solo una vez
			
    

    this.letra = Rey.LETRA_DE_REY;
	 	}

		@Override
	public boolean puedeMoverAqui(Tablero tablero, Posicion posicion) {
			// TODO Auto-generated method stub
			return false;
		}	
}
