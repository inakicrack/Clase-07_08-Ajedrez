package MisExcepciones;

public class FueraDeTableroRTE extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8053655275899994936L;

	public FueraDeTableroRTE(String msg) {
		super(msg);
	}
}
