/**
 * This is an abstract class from which all subclasses will derive from, it's a generic class that represents a building object.
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Inheritance Project
 * Fall 2021
 */
public abstract class Building 
{
protected String projectName;//the name of the building project.
protected String completeAddress;//the complete address of the project.
protected double totalSquareFeet;//the square footage of the building.
protected String occupancyGroup;//the IBC requires all buildings and structures be classified by occupancy group.
protected String subgroup;//the IBC requires all buildings and structures be classified by subgroup.
	
	/**
	 * 
	 * the empty-argument constructor initialize the instance variables.
	 */
	public Building()
	{
		projectName = "";//sets instance to "";
		completeAddress = "";//sets instance to "";
		totalSquareFeet = 0.0;//sets instance to 0.0;
		occupancyGroup = "";//sets instance to "";
		subgroup = "";//sets instance to "";
	}//end empty-argument constructor. 
	
	/**
	 * 
	 * @param projectName the value of projectName based on the calling method.
	 * @param completeAddress the value of completeAddress based on the calling method.
	 * @param totalSquareFeet the value of totalSquareFeet based on the calling method.
	 * @param occupancyGroup the value of occupancyGroup based on the calling method.
	 * @param subgroup the value of subgroup based on the calling method.
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end preferred constructor.
	
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
	 * @return a formatted String that contains all of the info about the object.
	 */
	public String displayData()
	{
		StringBuilder string = new StringBuilder("______________________________________________\n");
		string.append(getClass().getSimpleName());
		string.append("\n______________________________________________");
		string.append("\nProject Name: "+projectName);
		string.append("\nAddress: "+completeAddress);
		string.append("\nSquare Feet: "+totalSquareFeet);
		string.append("\nOccupancy Group: "+occupancyGroup);
		string.append("\nOccupancy Subgroup: "+subgroup);
		
		return ""+string;
	}//end displayType
	
	/**
	 * @return the projectName
	 */
	public String getProjectName() 
	{
		return projectName;
	}//end getProjectName

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}//end setProjectName

	/**
	 * @return the completeAddress
	 */
	public String getCompleteAddress() 
	{
		return completeAddress;
	}//end getCompleteAddress

	/**
	 * @param completeAddress the completeAddress to set
	 */
	public void setCompleteAddress(String completeAddress) 
	{
		this.completeAddress = completeAddress;
	}//setCompleteAddress

	/**
	 * @return the totalSquareFeet
	 */
	public double getTotalSquareFeet() 
	{
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * @param totalSquareFeet the totalSquareFeet to set
	 */
	public void setTotalSquareFeet(double totalSquareFeet) 
	{
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	 * @return the occupancyGroup
	 */
	public String getOccupancyGroup()
	{
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * @param occupancyGroup the occupancyGroup to set
	 */
	public void setOccupancyGroup(String occupancyGroup)
	{
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * @return the subgroup
	 */
	public String getSubgroup()
	{
		return subgroup;
	}//end getSubgroup

	/**
	 * @param subgroup the subgroup to set
	 */
	public void setSubgroup(String subgroup)
	{
		this.subgroup = subgroup;
	}//end setSubgroup
	
	/**
	 * 
	 * @return a String representation of this object's instance variables.
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
}
