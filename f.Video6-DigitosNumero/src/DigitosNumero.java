import java.util.Scanner;

public class DigitosNumero
{
	// Método que me permite obtener cada uno de los dígitos un número de 3 cifras.
	
	public static void main(String[] args)
	{
		// Variables a usar.
		int numeroAComprobar = 0;
		int unidades, decenas, centenas;
		
		// Recogemos el numero.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce, por favor, el número a comprobar: ");
		numeroAComprobar = teclado.nextInt();
		
		// Operación y selección de las cifras.
		// 125 -> 1, 2, 5 -------------- 000000125,00000000
		// Desplazar coma: *10: desplazar derecha - 125,0000*10 = 1250,000
		// /10: desplazar izquierda - 125,0000/10 = 12,50000
		// %10: 18 % 10 = 8
		
		unidades = numeroAComprobar % 10;
		decenas = (numeroAComprobar / 10) % 10;
		centenas = (numeroAComprobar / 100) % 10;
		
		
		// Muestreo de la información.
		System.out.println("El numero introducido: "+numeroAComprobar+" tiene como unidades, decenas y centenas, los"
				+ " valores siguientes en ese mismo orden: ");
		System.out.println(unidades);
		System.out.println(decenas);
		System.out.println(centenas);
		
		teclado.close();
	}

}
