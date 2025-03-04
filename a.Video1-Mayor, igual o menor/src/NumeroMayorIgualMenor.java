import java.util.Scanner;

public class NumeroMayorIgualMenor
{

	/*
	 * Conseguir un número introducido como referencia, comprobar si el número siguiente
	 * -que será tambien introducido por teclado- es mayor, menor
	 * o igual.
	 */
	
	public static void main(String[] args)
	{
		// Preparación del ejercicio, con variables y entrada por consola
		Scanner teclado = new Scanner(System.in);
		int numeroReferencia = 0;
		int numeroAComprobar = 0;
		boolean vivo = true;
		
		
		// Comienzo del ejercicio
		System.out.println("Bienvenido al programa para comprobar si un numero es mayor, igual o menor que otro.");
		
		System.out.println("Introduce ahora, por favor, el número que actuará como referencia...");
		numeroReferencia = teclado.nextInt();
		
		//numeroReferencia!=numeroAComprobar
		for(int i = 0;i<10 && vivo; i++)
		{
			System.out.println("Introduce, por favor, el número que quieres comprobar contra la referencia que es: "+numeroReferencia);
			numeroAComprobar = teclado.nextInt();
			
			// Visualización de los datos
			System.out.println("El número introducido como referencia es: " + numeroReferencia + ", y el número a comprobar "
					+ "es : "+ numeroAComprobar +".");
			
			System.out.println("___________________________________________________________________________________________");
			// Operar y comprobar si el numero es mayor, igual o menor que la referencia.
			
			if(numeroAComprobar > numeroReferencia)
			{
				System.out.println("El número a comprobar es MAYOR que la referencia.");
				System.out.println(numeroAComprobar + " es MAYOR que " + numeroReferencia + ".");
			}
			else
			{
				if(numeroAComprobar == numeroReferencia)
				{
					vivo = false;
					// i = 30;
					System.out.println("El número a comprobar es IGUAL que la referencia.");
					System.out.println(numeroAComprobar + " es IGUAL que " + numeroReferencia + ".");
				}
				else
				{
					System.out.println("El número a comprobar es MENOR que la referencia.");
					System.out.println(numeroAComprobar + " es MENOR que " + numeroReferencia + ".");
				}
			}
		}
			
		teclado.close();
	}

}
