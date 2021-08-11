import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import MisExcepciones.FormatoDeFicheroIncorrectoRTE;

public class TableroFicherible extends Tablero{

	public TableroFicherible() {
		super(0);
		
		int casillas = 0;
		
		String primeraLinea;
		FileReader fichero;
		try {
			fichero = new FileReader("inicial.txt");
			BufferedReader buffer = new BufferedReader(fichero);
			primeraLinea = buffer.readLine();
			if(primeraLinea == null) {
				buffer.close();
				throw new FormatoDeFicheroIncorrectoRTE("El fichero está vacío");
			}else {
				casillas = Integer.parseInt(primeraLinea);
			}
			buffer.close();

			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
		}
		this.redimensionarTablero(casillas);

	}
}
