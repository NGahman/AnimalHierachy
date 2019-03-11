
public class Bird extends Animal implements BirdInterface
{
	private double beaksize;
	private boolean wings;
	
	/**
	  * A no-arg constructor for the class.
	  */
	
	public Bird() 
	{
		this.beaksize = 5.5;
		this.wings = false;
	}
	
	/**
	 * A constructor with variables for the class.
	 * @param age Any double greater than 0.
	 * @param gender "male or female"
	 * @param name Any possible string.
	 * @param beaksize Any double greater than 0.
	 * @param wings True or false.
	 */
	
	public Bird(double age, String gender, String name, double beaksize, boolean wings)
	{
		super(age, gender, name);
		this.beaksize = beaksize;
		this.wings = wings;
	}
	
	/**
	 * Sets beaksize to the parameter.
	 * @param beaksize Any double greater than 0.
	 */
	@Override
	public void setBeaksize(double beaksize)
	{
		this.beaksize = beaksize;
	}
	
	/**
	 * Sets wings to the parameter.
	 * @param wings true or false.
	 */
	@Override
	public void setWings(boolean wings)
	{
		this.wings = wings;
	}
	
	/**
	 * Gets the field beaksize.
	 * @return String
	 */
	@Override
	public double getBeaksize()
	{
		return this.beaksize;
	}
	
	/**
	 * Gets the field wings.
	 * @return String
	 */
	@Override
	public boolean getWings()
	{
		return this.wings;
	}
	
	/**
	  * When the class is printed, returns the name, age, gender and beaksize.
	  */
	
	@Override
	public String toString()
	{
		return "name: " + name + " \nage: " + age + "\ngender: "+ gender + "\nbeaksize: " + beaksize + "\nwings: " + wings;
	}
	
	/**
	 * Returns the number 2.
	 */
	@Override
	public String HowManyLegs()
	{
		return "2";
	}
}
