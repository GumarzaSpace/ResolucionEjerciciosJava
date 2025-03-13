import java.util.Scanner;

public class Calculadora
{
	// Calculadora. Se debe llevar a cabo una calculadora con dos operandos. 
	// Siempre que se termine la operación se debe responder si continuar ejecutando operaciones, 
	// o finalizar el programa.
	public static void main(String[] args)
	{
		// Scanner para la recogida por teclado.
		Scanner teclado = new Scanner(System.in);
        
		// Comienzo de la calculadora y recogida de operandos
		boolean seguir = true;
		System.out.print("¡Bienvenido a la calculadora! Puedes sumar, restar, multiplicar, dividir y calcular el resto"
				+ " de una división.");
		System.out.println();
		System.out.println();
		
		do
		{	
			System.out.println("¡¡¡ Comenzamos !!!");
	        System.out.print("Introduce el primer operando: ");
	        double operando1 = teclado.nextDouble();
	        
	        System.out.print("Introduce el segundo operando: ");
	        double operando2 = teclado.nextDouble();
	        
	        // Seleccion de operación
	        System.out.println();
			System.out.println("Selecciona una operación:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
	
			int operacion = teclado.nextInt();
			double resultado = 0;
	
			switch(operacion)
			{
				case 1:
					resultado = (operando1 + operando2);
					break;
				case 2:
					resultado = (operando1 - operando2);
					break;
				case 3:
					resultado = (operando1 * operando2);
					break;
				case 4:
					resultado = (operando1 / operando2);
					break;
				case 5:
					resultado = (operando1 % operando2);
					break;
				default:
					System.out.println("***Operación desconocida o no aceptada.***");
					System.out.println();
					System.out.print("1. Sumar");
					System.out.print(" 2. Restar");
					System.out.print(" 3. Multiplicar");
					System.out.print(" 4. Dividir");
					System.out.println(" 5. Resto");
					System.out.println();
					break;
			}
	
			// Muestreo por consola de la operación.
			System.out.println("__________________________________________");
			System.out.println("El resultado es de la operación es: " + resultado);
			System.out.println();
			
			// Pregunta si quiere continuar.
			System.out.println("¿¿¿Desea continuar operando....??? (true / false)");
			seguir = teclado.nextBoolean();
			System.out.println();
		}
		while(seguir);	
		
		// Fin del ejercicio
		System.out.println("Fin de la ejecución.");
		teclado.close();
	}
	
}
