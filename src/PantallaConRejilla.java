
public class PantallaConRejilla {
	
	//********************************************************************************************************************
	// CONSTANTES ESTATICAS PUBLICAS:
	//********************************************************************************************************************
	
	final static char SIMBOLO_RELLENO_BLANCO = ' ';
	//Para que funcione en la consola hay que ir a opciones del fichero y poner la codificacion en UTF8 para ESTE fichero
	final static char SIMBOLO_RELLENO_NEGRO = '█';  //'@';
	
	final static char SEPARADOR_HORIZONTAL = '-';
	final static char SEPARADOR_VERTICAL = '|';
	final static char ADORNO_ESQUINA_BORDE = '+';
	
	final static char B = PantallaConRejilla.SIMBOLO_RELLENO_BLANCO;
	final static char N = PantallaConRejilla.SIMBOLO_RELLENO_NEGRO;
	final static char SH = PantallaConRejilla.SEPARADOR_HORIZONTAL;
	final static char SV= PantallaConRejilla.SEPARADOR_VERTICAL;
	
	final static  int CANTIDAD_CASILLAS_FIJADO = 8;
	final static int LINEAS_X_CASILLA_FIJADO = 5;

	final static int TAMANIO_REJILLA_VERTICAL = (    
											PantallaConRejilla.CANTIDAD_CASILLAS_FIJADO *
										   (PantallaConRejilla.LINEAS_X_CASILLA_FIJADO  +  1) //El adorno superior de cada casilla
									   ) + 1; //De la linea de borde final
	
	//**************************************************************************************************************************
	// LINEAS DE PINTADO DE TABLERO:
	// Son solo tres. Suficientes para "rellenar" el tablero básico.
	// Úsalas con .clone() !! O el cambio de una linea, será el cambio en todas, pues serían referencias a la misma linea
	// sin .clone()
	//***************************************************************************************************************************
			
	private final static char[] LINEA_SEPARADOR_HORIZONTAL = {
		PantallaConRejilla.ADORNO_ESQUINA_BORDE,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,

		PantallaConRejilla.ADORNO_ESQUINA_BORDE,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,

		PantallaConRejilla.ADORNO_ESQUINA_BORDE,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,

		PantallaConRejilla.ADORNO_ESQUINA_BORDE,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,

		PantallaConRejilla.ADORNO_ESQUINA_BORDE,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,

		PantallaConRejilla.ADORNO_ESQUINA_BORDE,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,

		PantallaConRejilla.ADORNO_ESQUINA_BORDE,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,

		PantallaConRejilla.ADORNO_ESQUINA_BORDE,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,
			PantallaConRejilla.SH, PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,PantallaConRejilla.SH,

		PantallaConRejilla.ADORNO_ESQUINA_BORDE
	};
	
	//-------------------------------------------------------------------------------------------------------------------------
	
	private final static char[] LINEA_RELLENO_HORIZONTAL_1 = {
		PantallaConRejilla.SV, 
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
			
		PantallaConRejilla.SV, 
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
		                    
		PantallaConRejilla.SV, 
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
		
		PantallaConRejilla.SV, 
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
		                    
		PantallaConRejilla.SV, 
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,	 	

		PantallaConRejilla.SV, 
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
		                    
		PantallaConRejilla.SV, 
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		
		PantallaConRejilla.SV, 
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
	 		
		PantallaConRejilla.SV
	};

	//------------------------------------------------------------------------------------------------------------------
	
	private final static char[] LINEA_RELLENO_HORIZONTAL_2 = {
		PantallaConRejilla.SV, 
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
		                    
		PantallaConRejilla.SV, 
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
		
		PantallaConRejilla.SV, 
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
		                    
		PantallaConRejilla.SV, 
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,	 	

		PantallaConRejilla.SV, 
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
		                    
		PantallaConRejilla.SV, 
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		
		PantallaConRejilla.SV, 
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
			PantallaConRejilla.N, PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,PantallaConRejilla.N,
		                    
		PantallaConRejilla.SV, 
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		PantallaConRejilla.B, PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,PantallaConRejilla.B,
	 		
		PantallaConRejilla.SV
	};
	
	//----------
	// Necesarias para calcular las posiciones de inicio de dibujo de cada casilla en la rejilla...
	//----------
	
	private final static int POS_X_DE_DIBUJO_PRIMERA_CASILLA = 2;
	private final static int POS_Y_DE_DIBUJO_PRIMERA_CASILLA = 4;
	private final static int DESPLAZAMIENTO_EN_X_PARA_DIBUJAR = 6;
	private final static int DESPLAZAMIENTO_EN_Y_PARA_DIBUJAR = 11;

	
	//*******************************************************************************************************************
	// ATRIBUTOS
	//*******************************************************************************************************************
	
	char[][] rejilla;
	
	//*******************************************************************************************************************
	// CONSTRUCTOR:
	//*******************************************************************************************************************
	
	public PantallaConRejilla() {
		//El new solo lo hago de una dimension, pq el inicio lo hago clonando lineas de simbolos
		// que son las tres largas de arriba.
		this.rejilla  = new char[PantallaConRejilla.TAMANIO_REJILLA_VERTICAL][];  //[PantallaConRejilla.TAMANIO_REJILLA];
		this.reiniciarPantalla();

	}
	
	//********************************************************************************************************************
	// METODOS
	//********************************************************************************************************************
	
	//El metodo clone y el toString apestan hacen cosas raras.
	public void reiniciarPantalla () {
		boolean cuadrado_blanco_primero = true;
		char[] linea_relleno_casilla;
		for (int i= 0; i < PantallaConRejilla.CANTIDAD_CASILLAS_FIJADO; i++) {
			
			int pos_inicio_fila = i * (PantallaConRejilla.LINEAS_X_CASILLA_FIJADO + 1);
			
			// Más uno por el separador horizontral
			this.rejilla[pos_inicio_fila] = clonarListaChars(PantallaConRejilla.LINEA_SEPARADOR_HORIZONTAL);
			
			if (cuadrado_blanco_primero == true) {
				linea_relleno_casilla =  PantallaConRejilla.LINEA_RELLENO_HORIZONTAL_1; //Aquí no hace falta clonar con clonarListaChars
			} else {
				linea_relleno_casilla =  PantallaConRejilla.LINEA_RELLENO_HORIZONTAL_2; //Aquí no hace falta clonar con clonarListaChars
			}
			//Pq se clona esa referencia (linea_relleno_casilla) en este for:
			for (int j = 1;  j < PantallaConRejilla.LINEAS_X_CASILLA_FIJADO + 1; j++) {
				this.rejilla[pos_inicio_fila + j] = clonarListaChars(linea_relleno_casilla);
			}
			
			cuadrado_blanco_primero = !cuadrado_blanco_primero;
		}
		this.rejilla[PantallaConRejilla.TAMANIO_REJILLA_VERTICAL - 1] = clonarListaChars(PantallaConRejilla.LINEA_SEPARADOR_HORIZONTAL);
	}
	
	//Este método hace falta para clonar las lineas que son constantes estaticas.. pq sino, se copian las referencias en vez de los arrays
	//Y te sucede que la linea se repite varias veces... y los cambios se reflejan en varias lineas tambien..pq las referecnias apuntan a la misma instancia
	private char[] clonarListaChars (char[] lista_vieja) {
		int tamanio = lista_vieja.length;
		char[] lista_nueva = new char[tamanio];
		for (int i = 0; i < tamanio; i++) {
			lista_nueva[i] = lista_vieja[i];
		}
		return lista_nueva;
	}
	
	//-------------------------------------------------------------------
	
	private Posicion calcularCoordsDeDibujo (Posicion posicion_de_casilla) {
		// Devuelve la posicion en la rejilla donde comenzar a dibuajar el cuadrado 3x4 donde van los simbolos de la pieza;
		
		int x_cas = posicion_de_casilla.getX();
		int y_cas = posicion_de_casilla.getY();
		
		int init_x_rej = PantallaConRejilla.POS_X_DE_DIBUJO_PRIMERA_CASILLA;
		int init_y_rej = PantallaConRejilla.POS_Y_DE_DIBUJO_PRIMERA_CASILLA;
		
		int despl_x = PantallaConRejilla.DESPLAZAMIENTO_EN_X_PARA_DIBUJAR;
		int despl_y = PantallaConRejilla.DESPLAZAMIENTO_EN_Y_PARA_DIBUJAR;
		
		int result_x = init_x_rej + (x_cas * despl_x);
		int result_y = init_y_rej + (y_cas * despl_y);

		Posicion pos_en_rejilla = new Posicion(result_x, result_y);

		return pos_en_rejilla;
	}
	
	//**********************************
	// TO STRING
	//**********************************
	public String toString() {
		return this.mostrarRejilla();
	}
	
	private String mostrarRejilla() {		
		String cadena = "\nTablero de ajedrez (en pantalla con rejilla):\n\n";
		for (int i = 0; i < PantallaConRejilla.TAMANIO_REJILLA_VERTICAL; i++) {
			cadena += String.valueOf( this.rejilla[i] ) + "\n";           
		}
		cadena += "\n";
		return cadena;
	}

	//************************************
	// Métodos de dibujo: 
	// - dibujarCasilla
	// - borrarCasilla
	//************************************
	
	public void actualizarCasilla (Casilla casilla, Posicion pos_casilla) {
		String simbolos_pieza = casilla.toString();
		char simbolo_izquierdo = simbolos_pieza.charAt(0);
		char simbolo_derecho = simbolos_pieza.charAt(1);
		
		Posicion pos_en_rejilla = this.calcularCoordsDeDibujo(pos_casilla);
		
		this.rellenarRejillaCentralCasilla(pos_en_rejilla, PantallaConRejilla.SIMBOLO_RELLENO_BLANCO);
		
		//La rejilla de dibujo, dentro de la casilla, es de 3x4, pero la de los ismbolos, es interna a la de dibujo, y es 1x2
		this.rejilla [pos_en_rejilla.getX() + 1] [pos_en_rejilla.getY() + 1] = simbolo_izquierdo;
		this.rejilla [pos_en_rejilla.getX() + 1] [pos_en_rejilla.getY() + 2] = simbolo_derecho;
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void rellenarRejillaCentralCasilla (Posicion pos_en_rejilla, char simbolo_de_relleno) {
		//Lo simbolos de la pieza se muestran en una rejilla central de la casilla de 3x4:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				this.rejilla[pos_en_rejilla.getX() + i][pos_en_rejilla.getY() + j] = simbolo_de_relleno;
			}
		}	
	}
	
	//------------------------------------------------------------------------------------------------
	
	/*
	public void borrarCasilla (Posicion pos_casilla) {
		char simbolo_de_borrado = PantallaConRejilla.SIMBOLO_RELLENO_BLANCO;
		if (!this.esCasillaBlanca(pos_casilla)) {
			simbolo_de_borrado = PantallaConRejilla.SIMBOLO_RELLENO_NEGRO;
		}
		
		Posicion pos_en_rejilla = this.calcularCoordsDeDibujo(pos_casilla);
		
		this.rellenarRejillaCentralCasilla(pos_en_rejilla, simbolo_de_borrado);
	}
	*/
	
	public void borrarRejilla () {
		/*
		Posicion casilla_actual = new Posicion (0,0);
		for (int x = 0; x < PantallaConRejilla.CANTIDAD_CASILLAS_FIJADO; x++) {
			for (int y = 0; y < PantallaConRejilla.CANTIDAD_CASILLAS_FIJADO; y++) {
				casilla_actual.setX(x);
				casilla_actual.setY(y);
				this.borrarCasilla(casilla_actual);
			}
		}
		*/
		this.reiniciarPantalla();
	}
	
	//----------------------------------------------------------------------------------------------
	
	private boolean esCasillaBlanca(Posicion pos) {
		boolean respuesta = false;
		
		if ((pos.getX() % 2) == 0) {
			//Fila par, comienza en casilla blanca:
			if ((pos.getY() % 2) == 0) {
				//Columna par, ES casilla blanca:
				respuesta = true;
			} else {
				//Columna impar, NO ES casilla blanca:
				respuesta = false;
			}
		} else {
			//Fila impar, comienza en casilla negra:
			if ((pos.getY() % 2) == 0) {
				//Columna par, NO ES casilla blanca:
				respuesta = false;
			} else {
				//Columna impar, ES casilla blanca:
				respuesta = true;
			}			
		}
		
		return respuesta;
	}
	
	//-----------------------------------------------------------------------------------------------------------

}
