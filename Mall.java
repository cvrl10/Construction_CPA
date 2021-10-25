/**
 * This is a subclass of Business, Mall is a more specific version of Business
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Inheritance Project
 * Fall 2021
 *
 */
public class Mall extends Business
{
private int numRentedUnits;//the number of units in the building that are currently being rented
private double medianUnitSize;//represents the median of all the rentable units of different size.
private int numParkingSpaces;//the total number of parking spaces around the mall.

	/**
	 * 
	 * the empty argument constructor initialize the instance variable
	 */
	Mall()
	{
		super();
		this.numRentedUnits = 0;
		this.medianUnitSize = 0;
		this.numParkingSpaces = 0;
	}//end empty-argument constructor.
	
	/**
	 * 
	 * @param projectName the value of projectName based on the calling method.
	 * @param completeAddress the value of completeAddress based on the calling method.
	 * @param totalSquareFeet the value of totalSquareFeet based on the calling method.
	 * @param occupancyGroup the value of occupancyGroup based on the calling method.
	 * @param subgroup the value of subgroup based on the calling method.
	 * sets numRentedUnits to 0.
	 * sets medianUnitSize to 0.
	 * sets numParkingSpaces to 0.
	 */
	Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentedUnits = 0;
		this.medianUnitSize = 0;
		this.numParkingSpaces = 0;
	}//end preferred constructor.
	
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
		String[] strings = {"", "\nRented Units: "+numRentedUnits, "\nMedian Unit Size: "+medianUnitSize, "\nParking Spaces: "+numParkingSpaces};
		for(String concat : strings)
			strings[0] += concat;
		
		return super.displayData()+strings[0];
	}//end displayData
	
	/**
	 * @return the numRentedUnits
	 */
	public int getNumRentedUnits()
	{
		return numRentedUnits;
	}//end getNumRentedUnits
	
	/**
	 * @param numRentedUnits the numRentedUnits to set
	 */
	public void setNumRentedUnits(int numRentedUnits) 
	{
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits
	
	/**
	 * @return the medianUnitSize
	 */
	public double getMedianUnitSize() 
	{
		return medianUnitSize;
	}//end getMedianUnitSize
	
	/**
	 * @param medianUnitSize the medianUnitSize to set
	 */
	public void setMedianUnitSize(double medianUnitSize) 
	{
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize
	
	/**
	 * @return the numParkingSpaces
	 */
	public int getNumParkingSpaces() 
	{
		return numParkingSpaces;
	}//end getNumParkingSpaces
	
	/**
	 * @param numParkingSpaces the numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int numParkingSpaces)
	{
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

	/**
	 * 
	 * @return a String representation of this object's instance variables
	 */
	@Override
	public String toString() 
	{
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}//end toString	
}//end class

