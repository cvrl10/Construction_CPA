/**
 * This is a subclass of Building, Residential is a more specific version of Building
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Inheritance Project
 * Fall 2021
 *
 */
public class Residential extends Building
{
protected int numBedrooms;//the number of bedrooms in the building.
protected int numBathrooms;//the number of bathroom in the building
protected boolean laundryRoom;//whether or not the building has a laundry room.
	
	/**
	 * 
	 * the empty argument constructor initialize the instance variable
	 * sets laundryRoom to true.
	 */
	Residential()
	{
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = true;
	}//end empty-argument constructor.
	
	/**
	 * 
	 * @param projectName the value of projectName based on the calling method.
	 * @param completeAddress the value of completeAddress based on the calling method.
	 * @param totalSquareFeet the value of totalSquareFeet based on the calling method.
	 * @param occupancyGroup the value of occupancyGroup based on the calling method.
	 * @param subgroup the value of subgroup based on the calling method.
	 * sets numBedrooms to 0.
	 * sets numBathrooms to 0.
	 * sets laundryRoom to true.
	 */
	Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = true;
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
		String[] strings = {"", "\nBedrooms: "+numBedrooms, "\nBathrooms: "+numBathrooms, "\nLaundry Room: "+laundryRoom};
		for (String concat : strings)
			strings[0] += concat;
		
		return super.displayData()+strings[0];
	}//end displayData
	
	/**
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() 
	{
		return numBedrooms;
	}//end getNumBedrooms
	
	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int numBedrooms)
	{
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms
	
	/**
	 * @return the numBathrooms
	 */
	public int getNumBathrooms()
	{
		return numBathrooms;
	}//end getNumBathrooms
	
	/**
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int numBathrooms) 
	{
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms
	
	/**
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() 
	{
		return laundryRoom;
	}//end isLaundryRoom
	
	/**
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) 
	{
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom
	
	/**
	 * 
	 * @return a String representation of this object's instance variables
	 */
	@Override
	public String toString()
	{
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]";
	}//end toString	
}//end class
