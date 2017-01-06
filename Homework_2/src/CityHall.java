import java.util.ArrayList;

public class CityHall extends Building {
	/**
	 * City Hall is where all of the major functions of running the city go down. 
	 * Police reside in city hall.
	 * @author Alex
	 * This also has an array of occupants.
	 */
	ArrayList<Police> CityHall = new ArrayList();
	
	public CityHall(String n, String a)
	{
		n = getName();
		a = getAddress();
	}
	
	// This class will display the array of current occupants
	
	
	public void AddPolice()
	{
		for (int i=0; i< CityHall.size(); i++)
		{
			Police p = new Police();
			CityHall.add(p);
		}
	}

}
