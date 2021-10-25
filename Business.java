/**
 * This is a subclass of Building, Business is a more specific version of Building.
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Inheritance Project
 * Fall 2021
 *
 */
public class Business extends Building
{	
protected int numRentableUnits; //the number of units in the building that can be rented.

	/**
	 * 
	 * the empty argument constructor initialize the instance variable
	 */
	Business()
	{
		super();
		this.numRentableUnits = 0;
	}//end empty-argument constructor 
	
	/**
	 * 
	 * @param projectName the value of projectName based on the calling method.
	 * @param completeAddress the value of completeAddress based on the calling method.
	 * @param totalSquareFeet the value of totalSquareFeet based on the calling method.
	 * @param occupancyGroup the value of occupancyGroup based on the calling method.
	 * @param subgroup the value of subgroup based on the calling method.
	 * sets numRentableUnits to 0.
	 */
	Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = 0;
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
		return super.displayData()+"\nRentable Units: "+numRentableUnits;
	}//end displayData
	
	/**
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}//end numRentableUnits
	
	/**
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int numRentableUnits) 
	{
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	
	/**
	 * 
	 * @return a String representation of this object's instance variables
	 */
	@Override
	public String toString()
	{
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}//end toString	
}//end class

