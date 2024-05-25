package entornos;

public class Vector {
	
	private double x;
	private double y;
	private double z;
	
	public Vector(double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public void setZ(double z) {
		this.z=z;
	}
	public double modulo() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
	}
	
	public static void main(String[] args) {
		Vector vector1= new Vector (5,3,1);
		System.out.println("El modulo del vector es: "+ vector1.modulo());

	}

}
