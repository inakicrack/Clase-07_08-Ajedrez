
public class Posicion {

	private int x;
	private int y;
	
	public Posicion(int posX, int posY) {
		this.x = posX;
		this.y = posY;
	}
	
	public Posicion(Posicion aPartirDeEsta) {
		this.setX( aPartirDeEsta.getX()  );
		this.setY( aPartirDeEsta.getY()  );
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int nuevaX) {
		this.x = nuevaX;
	}
	
	public void setY(int nuevaY) {
		this.y = nuevaY;
	}
	
	public boolean equals(Posicion pos1) {
		if(this.x == pos1.getX() && this.y == pos1.getY()) {
			return true;
		}else {
			return false;			
		}
	}
	
	public String toString() {
		return "La posición es:\n" + Integer.toString(this.x) + ", " + Integer.toString(this.y);
	}
}

