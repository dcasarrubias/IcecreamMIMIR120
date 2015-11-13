/*
 * David Casarrubias-Mena
 * COSC 120
 * Dr. Lindsay
 * November 12, 2015
 * This project creates a carton and radius with information entered by the user. 
 * Then serves the user ice cream until they no longer want any more. 
 */

import java.util.*;

public class Application {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double radius_scooper; // variable for the radius of the first scooper
		double radius_scooper2; // variable for the raidus of the second scooper
		double carton_radius; // variable for the raidus of the carton
		double carton_height; // variable for the height of the carton
		int amountOfScoops1; // variable that will store the amount of scoops the user wants for the first scooper
		int amountOfScoops2; // variable that will store the amount of scoops the user wants for the second scooper
		int choice; // variable that stores the decision of the user. 1 for more ice cream, 0 to stop. 
		
	
		
		System.out.println("What is the radius of your first scooper? "); // prompts user for the radius of the first scooper
		radius_scooper = input.nextDouble(); // stores the scooper radius in the variable radius_scooper
		
		System.out.println("What is the radius of your second scooper? "); // prompts the user for the radius of the second scooper
		radius_scooper2 = input.nextDouble(); // stores the radius of the second scooper in variable radius_scooper2
		
		System.out.println("What is the radius of your carton? "); // prompts user for radius of carton
		carton_radius = input.nextDouble();  // stores user input into variable carton_radius
		 
		System.out.println("What is the height of your carton? "); // prompts user for the height of the carton
		carton_height = input.nextDouble(); // stores carton height in variable carton_height
		
		IceCreamShoppe ic = new IceCreamShoppe(carton_radius, carton_height); // create object of IceCreamShoope
		Scoop scoop1 = new Scoop(radius_scooper);  // creates object of 1st scooper by passing the radius entered by the user. 
		Scoop scoop2 = new Scoop(radius_scooper2);  // creates object of 2nd scooper by passing the radius entered by the user.
		Carton carton = new Carton(carton_radius, carton_height); // creates object of the carton with the information entered by user
		
		
		
		System.out.println("Would you like more ice cream? (Enter 1 for yes and 0 for no)"); //asks user if they would like more ice cream.
		choice = input.nextInt(); // stores the decision in variable choice.
		
			while(choice == 1){ // while the user decides they want more icecream, do the following.
				
			System.out.println("How many " +radius_scooper + " scoops would you like?"); // asks user for the amount of scoops they would like.
			amountOfScoops1 = input.nextInt(); // stores the amount of scoops entered by the user
			ic.serve(amountOfScoops1,scoop1); // pass the amount of scoops wanted by the user and the scooper object to the serve method in the IceCream Shoppe class. 
		
	
			
			System.out.println("How many " + radius_scooper2 + " scoops would you like?");// asks user for the amount of scoops they would like.
			amountOfScoops2 = input.nextInt();// stores the amount of scoops entered by the user
			ic.serve(amountOfScoops2, scoop2);// pass the amount of scoops wanted by the user and the scooper object to the serve method in the IceCream Shoppe class. 
			
			
			
			System.out.println("Would you like more icecream? (Enter 1 for yes and 0 for no)"); // asks user if they would like more icecream.
			choice = input.nextInt(); // stores users decision in variable choice.
			
			
			if(choice == 0){ // if user doesn't want any more ice cream, print out number of cartons used
				System.out.println("Carton used " +ic.cartonsUsed() ); // prints out number of cartons used
				
			}
			
			}
			
	
		
		
		
		
		
		
		
	}
}
