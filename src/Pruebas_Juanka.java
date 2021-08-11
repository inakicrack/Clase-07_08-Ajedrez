
public class Pruebas_Juanka {

	public static void main(String[] args) {

		Ficha peon_negro_001     = (Ficha) new Peon("NEGRO");
		Posicion pos_001         =         new Posicion (0,0);
		
		Ficha caballo_blanco_002 = (Ficha) new Caballo("BLANCO");
		Posicion pos_002         =         new Posicion(4,3);
		
		Ficha caballo_negro_003  = (Ficha) new Caballo("NEGRO");
		Posicion pos_003         =         new Posicion(5,4);
		
		Ficha peon_blanco_004    = (Ficha) new Peon("BLANCO");
		Posicion pos_004         =         new Posicion(0,1);
		
		Ficha peon_blanco_005    = (Ficha) new Peon("BLANCO");
		Posicion pos_005         =         new Posicion(1,2);

		TableroDePantallaConRejilla tablero = new TableroDePantallaConRejilla();
		
		tablero.colocarPieza(peon_negro_001,      pos_001);
		tablero.colocarPieza(caballo_blanco_002,  pos_002);
		tablero.colocarPieza(caballo_negro_003,   pos_003);
		tablero.colocarPieza(peon_blanco_004,     pos_004);
		tablero.colocarPieza(peon_blanco_005,     pos_005);
				
		System.out.print("ANTES DE BORRAR: " + tablero);
		tablero.eliminarPieza(pos_004);
		System.out.print("DESPUES DE BORRAR: " + tablero);

		//TODO: Me he dado cuenta que la rejilla puede depender de la matriz de casillas (Ciclo borrar/actualizar/mostrar en tostring y yasta, no hay que mantenerla al dia)
		//TODO: El teblero inicial es como borrar la rejilla de pantalla, sustituyelo y descomplica el codigo
		
	}

}
