import java.util.Scanner;

public class Police extends Person implements Employee {
	/**
	 * @author Alex
	 * Police are a type of person and they also are employees.
	 * There are many different roles that police have.
	 * They are listed in an enumeration
	 */
	// Police can have many different roles
	
	enum Role{Patrol, Sargent, Captain, Chief}
	Role role;
	

	public Police(Role r, String n, int a, long p)
	{
		n = getName();
		a = getAge();
		p = getPhone();
		role = r;
	}

	public Police() {}

	/**
	 * These are the functions that implement Employee
	 * @return Money
	 * @return ID
	 */
	
	
	public int getPaid() {
		int money = 50000;
		
		return money;
	}

	
	public void reqId() {
		System.out.println("What is your Employee ID?");
		
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		
		System.out.printf("Your ID is %d.", input);
		
	}
}
