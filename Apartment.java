/**
 * This is a subclass of Residential, Apartment is a more specific version of Residential
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Inheritance Project
 * Fall 2021
 *
 */
public class Apartment extends Residential
{
private int numRentableUnits;//the number units that can be rented in the building.
private double avgUnitSize;//the average size of the apartments in the building
private boolean parkingAvailable;//a boolean value that indicates if onsite parking is available for the building.
	
	/**
	 * 
	 * the empty argument constructor initialize the instance variable
	 * sets parkingAvailable to true.
	 */
	Apartment()
	{
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0;
		this.parkingAvailable = true;
	}//end empty-argument constructor
	
	/**
	 * 
	 * @param projectName the value of projectName based on the calling method.
	 * @param completeAddress the value of completeAddress based on the calling method.
	 * @param totalSquareFeet the value of totalSquareFeet based on the calling method.
	 * @param occupancyGroup the value of occupancyGroup based on the calling method.
	 * @param subgroup the value of subgroup based on the calling method.
	 * sets numRentableUnits to 0.
	 * sets avgUnitSize to 0.
	 * sets parkingAvailable true.
	 */
	Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = 0;
		this.avgUnitSize = 0;
		this.parkingAvailable = true;
	}//end preferred constructor
	
	/**
	 * 
	 * eventually this method will be used to draw the object on the screen, but for the prototype, it will
	 * will simply print to the console: Drawing code for <<Object Type>>. All of the draw methods in the subclasses
	 * will do the same. This could have been written in the superclass but the UML Class Diagram 
	 * asked for an explicit definition in each subclass.
	 */
	public void draw()//prints the Class type of the object.
	{
		System.out.println("Drawing code for <<"+getClass().getSimpleName()+">>.");
	}//end draw
	
	/**
	 * 
	 * @return a formatted String that contains all of the info about the object, including inherited instance variables.
	 */
	public String displayData()
	{
		String[] strings = {"", "\nRentable Units: "+numRentableUnits, "\nAverage Unit Size: "+avgUnitSize, "\nParking: "+parkingAvailable};
		for(String concat : strings)
			strings[0] += concat;
		
		return super.displayData()+strings[0];
	}//end displayData
	
	/**
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}//end getNumRentableUnits
	
	/**
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int numRentableUnits)
	{
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	
	/**
	 * @return the avgUnitSize
	 */
	public double getAvgUnitSize() 
	{
		return avgUnitSize;
	}//end getAvgUnitSize
	
	/**
	 * @param avgUnitSize the avgUnitSize to set
	 */
	public void setAvgUnitSize(double avgUnitSize)
	{
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize
	
	/**
	 * @return the parkingAvailable
	 */
	public boolean isParkingAvailable() 
	{
		return parkingAvailable;
	}//end is parkingAvailable
	
	/**
	 * @param parkingAvailable the parkingAvailable to set
	 */
	public void setParkingAvailable(boolean parkingAvailable) 
	{
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
	
	/**
	 * 
	 * @return a String representation of this object's instance variables
	 */
	@Override
	public String toString() 
	{
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}//end toString
}//end class



