import java.util.Scanner;

public class CantidadPositivos
{
	//Escribir un programa que pida la cantidad de números positivos que se tienen que escribir y 
	//a continuación pida números hasta que se haya escrito la cantidad de números positivos indicada.
	public static void main(String[] args)
	{
		// Comienzo del ejercicio
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("En este programa vamos a recoger numeros positivos, en tal cantidad como indica el usuario...");
		System.out.println("Por favor, indica cuantos numeros positivos quieres que se recogan antes de finalizar el programa:");
		
		// Recogida de la cantidad de positivos
		int cantidadPositivos = teclado.nextInt();
		
		System.out.println("Se van a recoger..... "+cantidadPositivos+" numeros positivos.");
		System.out.println("___________________________________________");
		
		// Comienzo de recogida de numeros
		int contadorPositivos = 0;
		int numeroPositivo = 0;
		
		while(contadorPositivos<cantidadPositivos)
		{
			System.out.println("Por favor, introduce un numero:");
			numeroPositivo = teclado.nextInt();
			
			if(numeroPositivo>=1)
			{
				contadorPositivos++; // contadorPositivos = contadorPositivos + 1;
				System.out.println("***POSITIVO encontrado!");
				System.out.println(numeroPositivo);
			}
			
		}
		
		System.out.println("FIN del ejercicio.");
		teclado.close();
	}

}
