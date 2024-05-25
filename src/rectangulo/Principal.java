package rectangulo;

import java.util.Scanner;

public class Principal {
	public static void menu(Rectangulo rectangulo) {
		Scanner teclado=new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Menu: ");
			System.out.println("1. Perimetro");
			System.out.println("2. Area");
			System.out.println("3. Salir");
			System.out.println("Ingrese su opcion: ");
			opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Perimetro:"+rectangulo.calcularPerimetro());
				break;
			case 2:
				System.out.println("Area: "+rectangulo.calcularArea());
				break;
			case 3:
				System.out.println("Saliendoooooooooooooooooooo");
				teclado.close();
				break;
			default:
				System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
				break;
			}
		}while(opcion !=3);
		
	}
	public static void main(String[] args) {
		 Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
		 menu(rectangulo);
	}

}
