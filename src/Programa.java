import java.util.Scanner;

public class Programa {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n, n2;
		System.out.print("Introduzca el primer número entero: ");
		n = sc.nextInt();
		System.out.print("Introduzca el segundo número entero: ");
		n2 = sc.nextInt();
		Operaciones op= new Operaciones(n,n2);

		System.out.println("La suma de los números es: " + (op.suma()));

		System.out.println("La potencia del numero a elevado al numero b es: " + (op.potencia()));

		System.out.println("La radicacion de los números es: " + (op.radicacion()));


		
		//Imprimir la división
		if (n2!=0){
			System.out.println("La división de los números es: " + (op.division()));
		}else{
			System.out.println("No se puede dividir para cero");			
		}

	}
}
