import java.util.Scanner;

public class labthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	    System.out.println("Learn your squares and cubes!");
	    System.out.println();

	    Scanner sc = new Scanner(System.in);
	    String choice = "y";

	    while(choice.equalsIgnoreCase("y"))
	    {
	           
	            System.out.println("Enter an Integer: ");
	            int integerNext = sc.nextInt();     

	            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");       
	            System.out.println("======" + "  " + "======" + "  " + "======");

	            for(int i = 1; i <= integerNext; i++) 
	            {      
	                  int numberSquared = (int) Math.pow(i, 2);
	                  int numberCubed = (int) Math.pow (i, 3);

	             String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;

	             System.out.println(message);
	             System.out.println("");

	            }
	        
	              System.out.print("Continue? (y/n): ");
	              choice = sc.next();
	              System.out.println(); 
	                  }
	             }
	        }
	   


