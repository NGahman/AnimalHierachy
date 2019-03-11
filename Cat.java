public class Cat extends Animal implements CatInterface
{
	private String furcolor;
	private boolean claws;
	
	/**
	  * A no-arg constructor for the class.
	  */
	
	public Cat()
	{
		this.furcolor = "black";
	}
	
	/**
	 * A constructor with variables for the class.
	 * @param age Any double greater than 0.
	 * @param gender "male or female"
	 * @param name Any possible string.
	 * @param furcolor Any color.
	 * @param claws true or false.
	 */
	
	public Cat(double age, String gender, String name, String furcolor, boolean claws) 
	{
		super(age, gender, name);
		this.furcolor = furcolor;
		this.claws = claws;
	}
	
	/**
	 * Sets furcolor to the parameter.
	 * @param furcolor Any color.
	 */
	@Override
	public void setFurcolor(String furcolor)
	{
		this.furcolor = furcolor;
	}
	
	
	/**
	 * Sets claws to the parameter.
	 * @param claws true or false.
	 */
	@Override
	public void setClaws(boolean claws)
	{
		this.claws = claws;
	}
	
	/**
	 * Gets the field furcolor.
	 * @return String
	 */
	@Override
	public String getFurcolor()
	{
		return this.furcolor;
	}
	
	/**
	 * Gets the field claws.
	 * @return boolean
	 */
	@Override
	public boolean getClaws()
	{
		return this.claws;
	}
	
	/**
	  * When the class is printed, returns the name, age, gender and furcolor.
	  */
	
	@Override
	public String toString()
	{
		return "name: " + name + " \nage: " + age + "\ngender: " + gender + "\nfurcolor: " + furcolor + "\nclaws: " + claws;
	}
	
	/**
	 * Returns the number 4.
	 */
	@Override
	public String HowManyLegs()
	{
		return "4";
	}
}
