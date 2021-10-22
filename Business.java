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
}
