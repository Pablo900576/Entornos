package rectangulo;

public class Rectangulo {
	private double largo;
	private double ancho;

		public Rectangulo(double largo, double ancho) {
			this.largo=largo;
			this.ancho=ancho;
		}
		public double getLargo() {
			return largo;
		}
		public double getAncho() {
			return ancho;
		}
		public void setLargo(double largo) {
			this.largo=largo;
		}
		public void setAncho(double ancho) {
			this.ancho=ancho;
		}
		public String toString() {
			return "Rectangulo largo: " + largo + ", ancho:" + ancho;
		}
		public double calcularPerimetro() {
			return 2*(largo+ancho);
		}
		public double calcularArea() {
			return largo*ancho;
		}
		
		public static void main(String[] args) {
			Rectangulo rectangulo=new Rectangulo(8.0, 2.0);
			System.out.println(rectangulo.toString());
			rectangulo.setAncho(5);
			rectangulo.setLargo(6);
			System.out.println(rectangulo.toString());
			System.out.println("Perimetro del rectangulo: "+ rectangulo.calcularPerimetro());
			System.out.println("Area del rectangulo: "+ rectangulo.calcularArea());
	}
		

}
