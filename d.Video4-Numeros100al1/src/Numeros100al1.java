public class Numeros100al1
{

	/*
	 * Programa que muestre los números del 100 al 1.
	 *
	 */
	
	public static void main(String[] args)
	{
		// FOR
		for(int i=100;i>=1;i--)   // i = i - 1;
		{
			System.out.println(i);	
		}
		System.out.println("________________________");
			
		// WHILE
		int nWhile = 100;
		while(nWhile>=1)
		{
			System.out.println(nWhile);
			nWhile--;
		}
		System.out.println("************************");
		
		
		// DO-WHILE
		int doWhile = 100;
		do
		{
			System.out.println(doWhile);
			doWhile--;
			
		}
		while(doWhile>=1);
		

		
	}

}
