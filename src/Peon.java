
public class Peon extends Ficha{


	final static String LETRA_DE_PEON = "P";

	public Peon (Posicion posicion, String color) {
			//Si color = �NEGRA�, ya sabe lo que tiene que valer el atributo valor
			//Si color = �BLANCA�, ya sabes�
			//Si no es ninguno de los dos, lanza una excepcion de Color invalido
	//Cada clase va a tener este pedazo de codigo ( traducir de String aboolean) a ver si descubres que funcione en todos lados escribiendolo solo una vez
			
    

    this.letra = Peon.LETRA_DE_PEON;
	 	}

		@Override
	public boolean puedeMoverAqui(Tablero tablero, Posicion posicion) {
			// TODO Auto-generated method stub
			return false;
		}	
}
