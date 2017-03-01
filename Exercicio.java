package main;

import java.util.ArrayList;


public class Exercicio 
{

	
	public Exercicio()
	{
		
		
	}
	public void ex1()
	{
	
		
	}
	
		public static void main(String[] args)
		{
			ArrayList<String> arExercicio = new ArrayList<String> ();	
			    
			    arExercicio.add("b");
		        arExercicio.add("3");
		        arExercicio.add("Carruagens");
		        arExercicio.add("8.56");
		        arExercicio.add("caixas de armazenamento");
			System.out.println( Arrays.toString( arExercicio.toArray() ) );
			
			System.out.println("Insira palavra a acrescentar: ");
			Scanner scanner = new Scanner(System.in);
			String str1 = scanner.nextLine();
			arExercicio.add(str1);
			 System.out.println(arExercicio);
		
      
}

		
}