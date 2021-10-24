/**
 * This is a subclass of Residential, SingleFamilyHome is a more specific version of Residential
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Inheritance Project
 * Fall 2021
 *
 */
public class SingleFamilyHome extends Residential
{
private boolean garage;//a boolean value that indicates whether or not the house has a garage.
	
	/**
	 * 
	 * the empty argument constructor initialize the instance variable
	 * sets garage to true.
	 */
	SingleFamilyHome()
	{
		super();
		this.garage = true;
	}//end empty-argument constructor
	
	/**
	 * 
	 * @param projectName the value of projectName based on the calling method.
	 * @param completeAddress the value of completeAddress based on the calling method.
	 * @param totalSquareFeet the value of totalSquareFeet based on the calling method.
	 * @param occupancyGroup the value of occupancyGroup based on the calling method.
	 * @param subgroup the value of subgroup based on the calling method.
	 * sets garage to true.
	 */
	SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.garage = true;
	}//end preferred constructor
	
	/**
	 * 
	 * eventually this method will be used to draw the object on the screen, but for the prototype, it will
	 * will simply print to the console: Drawing code for <<Object Type>>. All of the draw methods in the subclasses
	 * will do the same.
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
		return super.displayData()+"\nGarage: "+garage;
	}
	
	/**
	 * @return the garage
	 */
	public boolean isGarage() 
	{
		return garage;
	}//end isGarage
	
	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage)
	{
		this.garage = garage;
	}//end setGarage
	@Override
	
	/**
	 * 
	 * @return a String representation of this object's instance variables
	 */
	public String toString()
	{
		return "SingleFamilyHome [garage=" + garage + "]";
	}//end toString
}