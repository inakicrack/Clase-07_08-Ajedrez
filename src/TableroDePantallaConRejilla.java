
public class TableroDePantallaConRejilla extends Tablero {
	
	PantallaConRejilla pantalla;
	
	public TableroDePantallaConRejilla () {
		super(PantallaConRejilla.CANTIDAD_CASILLAS_FIJADO);
		pantalla = new PantallaConRejilla();
	}
	/*
	//Version temporal que no comrpueba si pones dos piuezas en el mismo sitio:
	public void colocarPieza(Ficha pieza, Posicion pos_casilla) {
		this.matrizDeCasillas[pos_casilla.getX()][pos_casilla.getY()].asignarFichaACasilla(pieza);
		this.actualizarPantalla();
	}
	*/
	private void actualizarPantalla() {
		this.pantalla.borrarRejilla();
		
		Posicion pos_casilla_actual = new Posicion (0,0);
		for (int x = 0; x < PantallaConRejilla.CANTIDAD_CASILLAS_FIJADO; x++) {
			for (int y = 0; y < PantallaConRejilla.CANTIDAD_CASILLAS_FIJADO; y++) {
				if ( ! this.matrizDeCasillas[x][y].estaVacia() ) {
					pos_casilla_actual.setX(x);
					pos_casilla_actual.setY(y);
					this.pantalla.actualizarCasilla(this.matrizDeCasillas[x][y], pos_casilla_actual);
				}
			}
		}
		
	}
	/*
	public void eliminarPieza(Posicion pos_casilla) {
		if ( ! ( (Casilla) this.matrizDeCasillas[pos_casilla.getX()][pos_casilla.getY()]).estaVacia() ) {
			( (Casilla) this.matrizDeCasillas[pos_casilla.getX()][pos_casilla.getY()]).borrarFichaDeCasilla();
			this.actualizarPantalla();
		} else {
			System.out.println("Estas intentando eliminiar una pieza en una casilla que está vacía ARRACLAN !!");;
		}

	}*/
	
	
	public String toString() {
		//TODO: La Rejilla solo se debe actualizar cuando se muestra el tyablero
		//No es nedesario tenerla actualizada...
		//Su ciclo es: SE borra, se consulta la matriz de Casillas actuyalizando la rejilla y LUEGO se muestra.
		this.pantalla.reiniciarPantalla();
		this.actualizarPantalla();
		return this.pantalla.toString();
	}
}
