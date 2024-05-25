package entornos;

import java.util.Scanner;

import entornos.Operacion.OperacionDistanciaEuclidea;
import entornos.Operacion.OperacionProductoEscalar;
import entornos.Operacion.OperacionSuma;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		Vector vector1=new Vector(10,11,12);
		Vector vector2=new Vector(1,2,3);
		
		while(true) {
			System.out.println("Menu:");
			System.out.println("1. Sumar vectores");
			System.out.println("2. Calcular producto escalar");
			System.out.println("3. Calcular distancia euclidea");
			System.out.println("4. Salir");
			System.out.println("Ingrese su opcion: ");
			int numero = teclado.nextInt();
			switch(numero) {
				case 1:
					System.out.println("La suma de los vectores es: " + menu(new OperacionSuma(vector1, vector2)));
					break;
				case 2:
					System.out.println("El producto escalar de los vectores es: " + menu(new OperacionProductoEscalar(vector1, vector2)));
					break;
				case 3:
					System.out.println("La distancia euclidea entre los vectores es es: " + menu(new OperacionDistanciaEuclidea(vector1, vector2)));
					break;
				case 4:
					System.out.println("Saliendoooooooooooooooooo");
					teclado.close();
					System.exit(0);
					break;
				default:
					System.out.println("Opcion invalida");
			}
			teclado.close();
		}
	}
	public static double menu(Operacion operacion) {
		return operacion.realizarOperacion();
	}


}
