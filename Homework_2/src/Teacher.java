import java.util.Scanner;

public class Teacher extends Person implements Employee {
	/**
	 * Teachers are a sub class of Person and they are also employees
	 * @see
	 * @author Alex Blair
	 */
	
	public int Grade_lvl;
	public String Cert;
	
	/**
	 * This is the constructor for a teacher
	 * @param s 
	 * @param a
	 * @param p
	 */
	Teacher(String s, int a, long p)
	{
		s = getName();
		a = getAge();
		p = getPhone();
	}
	
	
	/**
	 * These are the get and set functions for teacher.
	 * @return Grade_lvl
	 * @return Certification
	 */
public int getGrade(){return Grade_lvl;}
public void setGrade(int Grade_lvl){this.Grade_lvl = Grade_lvl;}

public String getCert(){return Cert;}
public void setCert(String Cert){this.Cert = Cert;}


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
