import java.util.ArrayList;


public class City {
/** 
 * @author Alex Blair
 * @version 1.00 1/6/17
 * This is the main function of the city model
 * @param args
 */
	
	
	public static void main(String[] args) {
	// This is the main function for the city
		
		/**
		 * Below are new members of the city that are created
		 */
		
		Teacher T1 = new Teacher("Ms.Adams", 35, 2536696);
		Police P1 = new Police(Police.Role.Sargent,"Charles", 26, 2365879);
		Police P2 = new Police(Police.Role.Patrol,"Andrew", 22, 2521478);
		Police P3 = new Police (Police.Role.Captain,"Anthony", 21, 2325987);
		Police P4 = new Police (Police.Role.Chief,"Amy", 32, 9658741);
		Kid k1 = new Kid("Timmy", 7, 0);
		Kid k2 = new Kid("Lisa", 9, 1);
		Kid k3 = new Kid ("Bobby", 10, 2);
		
		School s1 = new School("Simville Elementary", "432 Coolio Blvd");
		CityHall c1 = new CityHall("Simville City Hall", "200 AwesomeSauce Ln");
		
		System.out.printf("The City is Simville!\n");
		System.out.printf("The School is %s.\n", s1);
		System.out.printf("The City Hall is %s.\n", c1);
	
		System.out.printf("The teacher of the town is %s.\n", T1);
		
		System.out.printf("The Police of the town are %s.\n", T1);
		System.out.printf("The Police of the town are %s.\n", T1);
		System.out.printf("The Police of the town are %s.\n", T1);
		System.out.printf("The Police of the town are %s.\n", T1);
		
		System.out.printf("Kid 1 is %s.\n", k1);
		System.out.printf("Kid 2 is %s.\n", k2);
		System.out.printf("Kid 3 is %s.\n", k3);
		
		
		

	}

}
