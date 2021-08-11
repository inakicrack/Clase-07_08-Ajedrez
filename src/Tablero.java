import MisExcepciones.FueraDeTableroRTE;
import MisExcepciones.YaHayPiezaRTE;

public class Tablero{

	private int casillas;
	Casilla [][] matrizDeCasillas;
	
	public Tablero (int casillas) {
		this.casillas = casillas;
		this.redimensionarTablero(casillas);		
	}

	public void redimensionarTablero(int nuevaCantCasillas) {
		casillas = nuevaCantCasillas;
		this.matrizDeCasillas = new Casilla [this.casillas] [this.casillas];
		this.asignarMemoriaACadaCasilla();
		this.vaciarTablero();
	}
	
	private void asignarMemoriaACadaCasilla () {	
		for (int i = 0; i < this.casillas; i++) {
			for (int j = 0; j < this.casillas; j++) {
				this.matrizDeCasillas[i][j] = new Casilla();
			}
		}
	}

	public void vaciarTablero () { 
		for (int i = 0; i < this.casillas; i++) {
			for (int j = 0; j < this.casillas; j++) {
				this.matrizDeCasillas[i][j].setFicha(null);
			}
		}
	}
	
	private String mostrarTablero() {
		Casilla aux;
		String cadena = "";
		cadena += "\nTablero de ajedrez:\n";
		for(int i = 0; i < this.casillas; i++) {
			for(int j = 0; j < this.casillas; j++) {
				aux = this.matrizDeCasillas[i][j];
				cadena += aux.toString();
				if(j < this.casillas - 1) {
					cadena += " ";
				}
			}
			cadena += "\n";
		}
		return cadena;
	}
	
	public boolean posicionIlegal(Posicion posI) {
		if( (this.casillas-1 < posI.getX()) || (this.casillas-1 < posI.getY()) ) {
			return true;
		}else {
			return false;
		}
	}
	
	public void colocarPieza(Ficha fichaC, Posicion posCasilla){
		if(posicionIlegal(posCasilla)) {
			throw new FueraDeTableroRTE("No existe esta posición en el tablero.");
		}else {
			(this.matrizDeCasillas[posCasilla.getX()][posCasilla.getY()]).asignarFichaACasilla(fichaC);
		}
	}

	public void colocarPieza(Ficha fichaC, Posicion posCasilla, boolean chequearPiezaPrevia) {
		if(chequearPiezaPrevia == true){
			if(this.matrizDeCasillas[posCasilla.getX()][posCasilla.getY()].tieneFicha()) {
				throw new YaHayPiezaRTE("Ya hay una pieza en la posicion");
		    }
		}
		this.colocarPieza(fichaC, posCasilla);
	}
	
	public void eliminarPieza(Posicion posCasilla) {
		if(posicionIlegal(posCasilla)) {
			throw new FueraDeTableroRTE("No existe esta posición en el tablero.");
		}else {
			if(this.matrizDeCasillas[posCasilla.getX()][posCasilla.getY()].tieneFicha()) {
				this.matrizDeCasillas[posCasilla.getX()][posCasilla.getY()].borrarFichaDeCasilla();
			}
		}
	}
	
	public String toString() {
		return this.mostrarTablero();
	}
	
}
