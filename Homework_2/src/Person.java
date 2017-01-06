
public abstract class Person {
	/**
	 * This is the base class for people in the city.
	 * They all have a name, age, and phone number.
	 * The appropriate get and set functions are included.
	 * 
	 * @author Alex
	 * @see
	 */
	
	private String name;
	private int age;
	private long Phone_num;
	
	public Person(){}
	
	/**
	 * These are the get and set functions.
	 * @return name
	 * @return age
	 * @return Phone_num
	 */
	
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public int getAge(){return age;}
	public void setAge(int age){this.age = age;}
	
	public long getPhone(){return Phone_num;}
	public void setPhone(){this.Phone_num = Phone_num;}
	

}

////////////// This class should be done
