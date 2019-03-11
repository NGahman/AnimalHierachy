public class Animal
{
	 protected double age;
	 protected String gender;
	 protected String name;
	 
	 /**
	  * A no-arg constructor for the class.
	  */
	 public Animal()
	 {
	 	this.age = 9.5;
	 	this.gender = "male";
	 	this.name = "Spot";
	 }
	 
	 /**
	  * A constructor with variables for the class.
	  * @param age Any number greater than 0.
	  * @param gender "male" or "female".
	  * @param name Any possible string.
	  */
	 
	 public Animal(double age, String gender, String name)
	 {
	 	this.age = age;
	 	this.gender = gender;
	 	this.name = name;
	 }
	 
	 /**
	  * Takes the parameter and sets age to it.
	  * @param age Any number greater than 0.
	  */
	 
	 public void setAge(double age)
	 {
	 	this.age = age;
	 }
	 
	 /**
	  * Takes the parameter and sets gender to it.
	  * @param gender "male" or "female".
	  */
	 
	 public void setGender(String gender)
	 {
	 	this.gender = gender;
	 }
	 
	 /**
	  * Takes the parameter and sets name to it.
	  * @param name Any possible string.
	  */
	 
	 public void setName(String name)
	 {
	 	this.name = name;
	 }
	 
	 /**
	  * Returns the field age.
	  * @return double
	  */
	 
	 public double getAge()
	 {
	 	return this.age;
	 }
	 
	 /**
	  * Returns the field gender.
	  * @return String
	  */
	 
	 public String getGender()
	 {
	 	return this.gender;
	 }
	 
	 /**
	  * Returns the field name.
	  * @return String
	  */
	 
	 public String getName()
	 {
	 	return this.name;
	 }
	 
	 /**
	  * When the class is printed, returns the name, age and gender.
	  */
	 @Override
	 public String toString()
	 {
	 	return "name: " + name + " \nage: " + age + "\ngender: "+ gender;
	 }
	 
	 /**
	  * Returns "I don't know what you're talking about...".
	  * @return String
	  */
	 
	 public String HowManyLegs()
	 {
	 	return "I don't know what you're talking about...";
	 }
	 
}