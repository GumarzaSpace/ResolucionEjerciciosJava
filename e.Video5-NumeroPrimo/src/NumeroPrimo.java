import java.util.Scanner;

public class NumeroPrimo
{
	/*
	 * Solicitar numero por teclado y comprobar si es primo. Mostrar por pantalla
	 * tal info.
	 */	
	
	public static void main(String[] args)
	{
		// Preparación del ejercicio.
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		boolean esPrimo = true;
		
		// Comienzo del ejercicio
		System.out.println("Bienvenido al cálculo de número primo.");
		System.out.println("Introduzca, por favor, el número a comprobar...");
		numero = teclado.nextInt();
		System.out.println("El número que se va a calcular si es primo es: "+numero);
		
		
		// Logica del ejercicio
		// Numero primo; solamente es divisible entre si mismo y el 1. - (6 % 3 == 0)
		
		// v1, simple y sencilla.
		/*
		 * if(numero == 1)
		 * { 
		 * 	esPrimo = false; 
		 * } 
		 * else
		 * { // 6 - > 2,3,4,5 
		 * 	// 15 -> 2,3,4,5,6,7,8,9,10,11,12,13,14  
		 * 
		 * 	for(int i=2;i<=numero-1 && esPrimo;i++) 
		 * 	{ 
		 * 		if(numero%i == 0) 
		 * 		{ 
		 * 			esPrimo = false; 
		 * 		} 
		 * 	} 
		 * }
		 */
		
		// v2, mas compleja en visión lógica.
		if(numero == 1 || numero%2==0)
		{
			esPrimo = false;
		}
		else
		{				
			for(int j=3;j*j<=numero && esPrimo;j+=2) // j = j+2;
			{
				if(numero%j == 0)
				{
					esPrimo = false;
				}		
			}
		}
		
		
		// Resolucion
		System.out.println("_______________________________________________________");
		System.out.println("¿El numero es primo? "+esPrimo);
		
		
		teclado.close();
	}

}
