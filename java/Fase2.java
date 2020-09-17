import java.util.ArrayList;
import java.util.Scanner;


public class Fase2 {
	 public static void main(String[] args) { 
		  
		 int b5=5, b10=10, b20=20, b50=50, b100=100, b200=200, b500=500, totalb=0;
		  ArrayList<String> dish= new ArrayList<String>();
		  ArrayList<Integer> price = new ArrayList<Integer>();
		  Scanner input= new Scanner(System.in);

		  // crear menu
		  System.out.println("Crear Menu ");
		  System.out.println("Introduce nombre de los platos: ");
		  int exceptionChecker = 0;
		  
		  try{
			  for (int i=0; i<3;i++) {	  
				  System.out.println("Plato " + (i+1) + ": " );
				  dish.add(input.nextLine());	
			  }		  
			  System.out.println("Introduce precio: ");
			  
			  for (int j=0; j<dish.size();j++) {
				  System.out.println(dish.get(j) + ":");
				  price.add(input.nextInt());	
			  }		  
		  } catch (Exception e) {
			  System.out.println("Dato introducido no valido. Precio debe ser un numero entero.");	
			  exceptionChecker = 1;
		  }
			  
		  //imprimir menu
		  if(exceptionChecker==0) {
			  System.out.println("\t \t MENU ");
			  System.out.println("  PLATO \t\t\t\t\t PRECIO ");
		  
			  for (int i=0; i<dish.size();i++) {
			  System.out.print((i+1) +". " + dish.get(i) + "\t\t\t\t\t " + price.get(i) +"\n");
			  }
		  
		  //order 
			  ArrayList<Integer> order = new ArrayList <Integer>();
			  System.out.println("\nElige platos" );
			  System.out.println("Digite 0(zero) para finalizar" );
		
			  try {
				  int option=1;
				  while( option!=0) {
					  option=input.nextInt();
					  if (option==0) {
						  break;
					  }
					  order.add(option);	
				  }
				  input.close();
			  } catch (Exception e){
				  System.out.println("Dato introducido no valido.");
			  }
		  }
    }
}