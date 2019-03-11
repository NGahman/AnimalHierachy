
public class BirdCat extends Animal implements CatInterface, BirdInterface 
{
	private double beaksize;
	private String furcolor;
	private boolean wings, claws;
	public BirdCat()
	{
		this.beaksize = 5.5;
		this.wings = false;
		this.furcolor = "black";
		this.claws = true;
	}
	
	/**
	 * A constructor with variables for the class.
	 * @param age Any double greater than 0.
	 * @param gender "male or female"
	 * @param name Any possible string.
	 * @param beaksize Any double greater than 0.
	 * @param wings True or false.
	 * @param furcolor Any color.
	 * @param claws true or false.
	 */
	
	public BirdCat(double age, String gender, String name, double beaksize, boolean wings, String furcolor, boolean claws)
	{
		super(age, gender, name);
		this.beaksize = beaksize;
		this.wings = wings;
		this.furcolor = furcolor;
		this.claws = claws;
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
		// TODO Auto-generated method stub
		return this.wings;
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
	 * Returns the number 6.
	 */
	
	@Override
	public String HowManyLegs()
	{
		return "6";
	}
	
	/**
	  * When the class is printed, returns the name, age, gender and beaksize.
	  */
	
	@Override
	public String toString()
	{
		return "name: "+name+"\nage: "+age+"\ngender: "+gender+"\nbeaksize: "+beaksize+"\nwings: "+wings+"\nfurcolor: "+furcolor+"\nclaws: "+claws;
	}
}
