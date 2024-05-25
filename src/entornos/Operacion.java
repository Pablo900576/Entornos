package entornos;

public abstract class Operacion {
	protected Vector vector1;
	protected Vector vector2;
	
	public Operacion (Vector vector1, Vector vector2) {
		this.vector1=vector1;
		this.vector2=vector2;
	}
	
	public Vector getVector1() {
		return vector1;
	}
	public Vector getVector2() {
		return vector2;
	}
	
	public void setVector1(Vector vector1) {
		this.vector1=vector1;
	}
	public void setVector2(Vector vector2) {
		this.vector2=vector2;
	}
	
	public abstract double realizarOperacion();
	
	public static class OperacionSuma extends Operacion{
		public OperacionSuma(Vector vector1, Vector vector2) {
			super(vector1, vector2);
		}
		@Override
		public double realizarOperacion() {
			double resultadoX=vector1.getX() + vector2.getX();	
			double resultadoY=vector1.getY() + vector2.getY();	
			double resultadoZ=vector1.getZ() + vector2.getZ();
			return new Vector(resultadoX, resultadoY, resultadoZ).modulo();
		}
	}
	public static class OperacionProductoEscalar extends Operacion{
		public OperacionProductoEscalar(Vector vector1, Vector vector2) {
			super(vector1, vector2);
		}
		@Override
		public double realizarOperacion() {
			double resultado= (vector1.getX()*vector2.getX()) + (vector1.getY()*vector2.getY()) + (vector1.getZ()*vector2.getZ());
					

			return resultado;
		}
	}
	public static class OperacionDistanciaEuclidea extends Operacion{
		public OperacionDistanciaEuclidea(Vector vector1, Vector vector2) {
			super(vector1, vector2);
		}
		@Override
		public double realizarOperacion() {
			double diferenciaX=vector1.getX() - vector2.getX();	
			double diferenciaY=vector1.getY() - vector2.getY();	
			double diferenciaZ=vector1.getZ() - vector2.getZ();
			return Math.sqrt(Math.pow(diferenciaX, 2)+ Math.pow(diferenciaY, 2)+Math.pow(diferenciaZ, 2));
		}
	
	
	}
}
