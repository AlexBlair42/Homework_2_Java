
public class Kid extends Person {
	/** 
	 * Kids are a type of person
	 * Kids go to school and eat candy
	 * @author Alex Blair
	 */
	
	public String FavCandy;
	
	/**
	 * These are the get and set functions for kids.
	 * @return Favorite Candy
	 */
	public String getCandy(){return FavCandy;}
	public void setCandy(String FavCandy){this.FavCandy = FavCandy;}
	
	Kid(String n, int a, long e)
	{
		n = getName();
		a = getAge();
		e = getPhone();
		
	}
	public Kid() {
		// TODO Auto-generated constructor stub
	}

}

///////////// This class should be done
