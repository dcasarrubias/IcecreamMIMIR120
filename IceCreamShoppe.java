
public class IceCreamShoppe {
	private double carton_height; // The The height of an ice cream carton in centimeters
	private double carton_radius; // The radius of an ice cream carton in centimeters
	private int cartons_used = 1;  // The number of cartons that have been used. initialized to 1
	private Carton current_carton; // The carton that is currently being used to dispense ice cream
	
	
	
	public IceCreamShoppe(double carton_radius, double carton_height){ // constructor for IceCreamShoppe
		current_carton = new Carton(carton_radius, carton_height); // first carton is created 
		this.carton_radius = carton_radius; // sets this.carton_radius equal to the radius of the carton
		this.carton_height = carton_height; // sets this.carton_height equal to the height of the carton
		
	}
	
	public int cartonsUsed(){ // method to return the amount of cartons that have been used
		return cartons_used; // Determines how many cartons have been used by returning the value 
		
	}
	
	/* 
	 * Serve a number of scoops. Serve the provided number of scoops, keeping track of when a new carton of
	 *  ice cream needs to be opened.
	*/
	public void serve(int number_of_scoops, Scoop scooper){ 
		for(int i = 0; i < number_of_scoops; i++){	// for loop that will continue to iterate as long as i is less than the number of scoops entered by user.
			if(current_carton.hasEnoughFor(scooper) == true){ // check to see if enough ice cream remains
			 current_carton.remove(scooper);
			}else { 
				current_carton = new Carton(carton_radius,carton_height); // if there isn't enough ice cream open new carton 
				cartons_used++; // and increment cartons used
				current_carton.remove(scooper); // and continue to remove from the new carton
				
			}
		}
				
			}
		
				
				}
			