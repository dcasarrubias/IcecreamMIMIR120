
public class Scoop {
	private double radius; // the radius of the scoop
	
	public Scoop(double radius){ // constructor for scoop object
		this.radius = radius; // sets this.readius to radius
	}
	/*
	 * Accessor for the radius
	 * returns the radius of the scoop in centimeters
	 */
	public double radius(){
		return this.radius; // returns the radius
	}
	/*
	 * Virtual accessor for the volume.
	 * return the volume of the scoop in cubic centimeters
	 */
	public double volume(){
		return ((double)4/3) * Math.PI * (Math.pow(this.radius, 3)); // returns the volume of one scoop. Had to cast 4/3 as double or else it would continually do integer division and multiply 1 * pi * radius^3. 
	}
	
	
}
