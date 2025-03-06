import java.util.Scanner;

public class Potencias
{

	/*
	 * 
	 * Realizar un programa java que calcule potencias a partir de una base y un
	 * exponente. En caso de que el exponente sea 0 o menor el
	 * resultado sera 1. En caso de que la base sea 0 o menor el resultado sera 1.
	 * 
	 */
	
	public static void main(String[] args)
	{

		// Preparación del ejercicio
		Scanner teclado = new Scanner(System.in);
		int base = 0;
		int exponente = 0;
		int resultadoPotencia = 0;
		
		// Comienzo y desarrollo del ejercicio
		System.out.println("Bienvenido al ejercicio de calculo de potencias.");
		System.out.println("Introduce, por favor, la base de la potencia...");
		base = teclado.nextInt();
		
		System.out.println("La base de la potencia es..."+base);
		System.out.println("Introduce, por favor, el exponente...");
		exponente = teclado.nextInt();
		
		System.out.println("La base recogida es: "+ base + " y el exponente es: "+exponente);
		
		// Logica del ejercicio
		// 4^3 = 4*4*4
		// 7^5 = 7*7*7*7*7
		// 7^1 = 7
		// 5^1 = 5
		
		if(base <= 0 || exponente <= 0)
		{
			resultadoPotencia = 1;	
		}
		else
		{
			if(exponente == 1)
			{
				// porque poner el if del exponente = 1
				resultadoPotencia = base;
			}
			else //if(exponente >= 2)
			{
				resultadoPotencia = base*base;
				// 5^3 -> 5*5*5 <<<<<- (25*5) -> 125
				// 3^7 -> 3*3*3*3*3*3*3
				for(int i=0;  i<exponente-2 ;i++)
				{
					resultadoPotencia = resultadoPotencia * base;
				}
			}		
		}
		
		System.out.println("______________________________________________");
		System.out.println("El resultado final de la potencia es: "+resultadoPotencia);

		teclado.close();	
		
	}

}
