
public class Tablero {

	final int casillas;
	Casilla [][] matrizDeCasillas;
	public Tablero (int casillas) {
		this.casillas = casillas;
		this.matrizDeCasillas = new Casilla [this.casillas] [this.casillas];
		this.asignarMemoriaACadaCasilla();
		this.vaciarTablero();		
	}

	private void asignarMemoriaACadaCasilla () {
		
		for (int i = 0; i < this.casillas; i++) {
			for (int j = 0; i < this.casillas; j++) {
				this.matrizDeCasillas[i][j] = new Casilla();
			}
		}
	}

	public void vaciarTablero () { 
		for (int i = 0; i < this.casillas; i++) {
			for (int j = 0; i < this.casillas; j++) {
				this.matrizDeCasillas[i][j].setFicha(null);
			}
		}
	}
}
