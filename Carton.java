
public class Carton {
	private double contains; // amount of ice cream remaining in cubic centimeters
	
	public Carton(double radius, double height){
		contains = (Math.PI * Math.pow(radius, 2))* height;
	}
	/*
	 * Determines if enough ice cream remains. Calculates if enough ice cream remains in the carton to
	 * fill the scoop.
	 */
	public boolean hasEnoughFor(Scoop scoop){
		if(contains >= scoop.volume() ){
			return true;
			
		}
		return false;
				
	}
	/*
	 * Remove a scoopful of ice cream. Updates the amount of ice cream remaining in the carton if one scoop
	 * has been removed. 
	 */
	public void remove(Scoop scoop){
		contains-= scoop.volume(); // remove a scoop of icecream and update amount remaining in carton 
		
	}
	
}
