import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException
	{
		File file = new File("ConstructionFile");
		Scanner reader = new Scanner(file);
		String[] string = new String[4];
		double footage;
		
		for(int i = 0; i < 2; i++)
				string[i] = reader.nextLine();
		
		footage = reader.nextDouble();
		reader.nextLine();
		
		for (int i = 2; i < 4; i++)
			string[i] = reader.nextLine();
		
		Business project = new Business();
		Mall mall = new Mall();
		Residential res = new Residential(string[0], string[1], footage, string[2], string[3]);
		Apartment apt = new Apartment();
		SingleFamilyHome home = new SingleFamilyHome();
		
		res.setNumBedrooms(5);
		res.setNumBathrooms(3);
		
		System.out.println(project.displayData());
		System.out.println();
		System.out.println(mall.displayData());
		System.out.println();
		System.out.println(res.displayData());
		System.out.println();
		System.out.println(apt.displayData());
		System.out.println();
		System.out.println(home.displayData());
		
		System.out.println();
		mall.draw();
		project.draw();
		res.draw();
		apt.draw();
		home.draw();
		
		System.out.println();
		System.out.println(res);
		System.out.println(home);
		
		System.out.println();
		
		
	}
}
