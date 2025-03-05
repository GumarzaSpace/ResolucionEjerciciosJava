import java.util.Scanner;

public class NumerosMultiplos
{

	/*
	 * Programa que a partir de un numero entero nos imprima por consola si ese
	 * numero es múltiplo de otro numero, o no. Ambos deben ser introducidos por consola.
	 */	
	
	public static void main(String[] args)
	{
		// Preparación del ejercicio
		Scanner teclado = new Scanner(System.in);
		int numeroAComprobar = 0;
		int mulitploAComprobar = 0;
		
		// Desarrollo del ejercicio
		// 15; 15*1 15*2 15*3 15*4
		//      15   30    45   60
	    //	(X / 15)	X % 15 -> 0	  50 % 15 ->5
		System.out.println("Bienvenido a la comprobación de numeros múltiplos.");
		
		System.out.println("Por favor, introduce el número a comprobar...");
		numeroAComprobar = teclado.nextInt();
		
		System.out.println("Por favor, introduce el múltiplo a comprobar. El número a comprobar es: "+numeroAComprobar);
		mulitploAComprobar = teclado.nextInt();
		
		System.out.println("El número a comprobar es: "+ numeroAComprobar +", mientras que el múltiplo es: "+mulitploAComprobar);
		System.out.println("_______________________________________________________________________________________");
		
		// Lógica y comprobación del ejercicio
		if(numeroAComprobar % mulitploAComprobar == 0)
		{
			// Es multiplo! (Divisible)
			System.out.println(numeroAComprobar + " y " + mulitploAComprobar + " SON múltiplos !!!");
			
		}
		else
		{
			// NO es multiplo.
			System.out.println(numeroAComprobar + " y " + mulitploAComprobar + " NO! son múltiplos.");
		}
		
		
		teclado.close();
	}

}
