
public class Pruebas {

	public static void main(String[] args) {
		TableroDePantallaConRejilla tab1 = new TableroDePantallaConRejilla();
		System.out.println(tab1);
		
		Ficha peonBlanco01 = (Ficha) new Peon("BLANCO");
		Posicion pos01 = new Posicion (0,0);
		
		Ficha caballoNegro01 = (Ficha) new Caballo("NEGRO");
		Posicion pos02 = new Posicion (3,5);
		
		Ficha reinaBlanca01 = (Ficha) new Reina("BLANCO");
		Posicion pos03 = new Posicion (7,7);
		
		Ficha reyNegro01 = (Ficha) new Rey("NEGRO");
		Posicion pos04 = new Posicion (6,1);
		
		Ficha alfilBlanco01 = (Ficha) new Alfil("BLANCO");
		Posicion pos05 = new Posicion (9,9);
		
		tab1.colocarPieza(peonBlanco01, pos01);
		tab1.colocarPieza(caballoNegro01, pos02);
		tab1.colocarPieza(reinaBlanca01, pos03);
		tab1.colocarPieza(reyNegro01, pos04);
		
		System.out.println(tab1);
		
		tab1.colocarPieza(alfilBlanco01, pos04, false);
		
		System.out.println(tab1);
		
		tab1.eliminarPieza(pos05);
		
		System.out.println(tab1);
	}

}
