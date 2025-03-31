import java.util.Scanner;

public class DesgranarCifras
{
	// Pedir por teclado al usuario un número, asegurarse que tiene 9 cifras como máximo. 
	// Pedir otro número, asegurando entre 1 y 9. Este número solicita cuantas cifras desgranar.
	// Mostrar por pantalla el resultado desgranado.
	public static void main(String[]args)
	{
		int numeroAComprobar = 0, cifrasAComprobar = 0;
		int unidades, decenas, centenas, uMillar, dMillar, cMillar, uMillon, dMillon, cMillon;
		
		// Bienvenida al ejercicio
		System.out.println("Se va a desgranar un numero de máximo 9 cifras. El usuario decide la cantidad de cifras a desgranar.");
		System.out.println();
		
		// Recogemos el numero
		Scanner teclado = new Scanner(System.in);
		System.out.println("1.- Introduce, por favor, el número a comprobar (no debe tener más de 9 cifras): ");
		numeroAComprobar = teclado.nextInt();
		
		// Comprobamos la validez del numero
		if(numeroAComprobar>999999999)
		{
			System.out.println("Error. Número introducido no válido.");
			numeroAComprobar = -1;
		}	
		
		// Recogemos la cantidad de cifras
		System.out.println("2.--- Introduce, por favor, las cifras a comprobar (no debe ser menor que 1, ni mayor de 9): ");
		cifrasAComprobar = teclado.nextInt();
		
		// Comprobamos la validez de las cifras
		if(cifrasAComprobar<1 || cifrasAComprobar>9)
		{
			System.out.println("Error. Cifras introducidas no válidas.");
			cifrasAComprobar = -1;
		}	
		
		// Comprobamos que este todo ok para desgranar
		if(numeroAComprobar != -1 && cifrasAComprobar != -1) 
		{
			// Operación y selección de las cifras
			// 125 -> 1, 2, 5 -------------- 125,00000000
			// Desplazar coma: *10: desplazar derecha - 125,0000*10 = 1250,000
			// /10: desplazar izquierda - 125,0000/10 = 12,50000
			// %10: 18 % 10 = 8
			
			System.out.println("El numero introducido; "+numeroAComprobar+" tiene los valores siguientes: ");
			
			// METODO 1.
			System.out.println("--- METODO 1 ---");
			unidades = numeroAComprobar % 10;
			decenas = (numeroAComprobar / 10) % 10;
			centenas = (numeroAComprobar / 100) % 10;
			uMillar = (numeroAComprobar / 1000) % 10;
			dMillar = (numeroAComprobar / 10000) % 10;
			cMillar = (numeroAComprobar / 100000) % 10;
			uMillon = (numeroAComprobar / 1000000) % 10;
			dMillon = (numeroAComprobar / 10000000) % 10;
			cMillon = (numeroAComprobar / 100000000) % 10;
			
			// con switch podremos escoger cada uno de los 9 casos.
			switch (cifrasAComprobar)
			{
				case 9:
					System.out.println(cMillon);
				case 8:
					System.out.println(dMillon);
				case 7:
					System.out.println(uMillon);
				case 6:
					System.out.println(cMillar);
				case 5:
					System.out.println(dMillar);
				case 4:
					System.out.println(uMillar);
				case 3:
					System.out.println(centenas);
				case 2:
					System.out.println(decenas);
				case 1:
					System.out.println(unidades);
					break;
			}
			
			System.out.println("________________________________________________");
			
			// METODO 2.
			System.out.println("*** METODO 2 ***");

			System.out.println(numeroAComprobar%10);
			for(int i = 0; i<cifrasAComprobar-1; i++)
			{
				numeroAComprobar = numeroAComprobar / 10;
				System.out.println(numeroAComprobar % 10);
			}	
	
		}
		else
			System.out.println("Fin del ejercicio tras error.");

		// Final y cierre del Scanner
		teclado.close();
	}
}

