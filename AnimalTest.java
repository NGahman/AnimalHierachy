import java.util.ArrayList;
public class AnimalTest 
{

	public static void main(String[] args) 
	{
		//Declares objects
		Animal stray = new Animal(10.0, "female", "Greg");
		Cat kitty = new Cat(8.0, "male", "Sylvester", "black", true);
		Bird birdy = new Bird(2.0, "male", "Tweety", 2.0, false);
		BirdCat birdcat = new BirdCat(9.0, "female", "Syltweet", 8.0, true, "red", false);
		
		//Creates ArrayList
		ArrayList<Animal> horde = new ArrayList<Animal>();
		
		//Adds stray, kitty and birdy to the ArrayList
		horde.add(stray);
		horde.add(kitty);
		horde.add(birdy);
		horde.add(birdcat);
		
		//For all three objects, prints out the class and how many legs the class has.
		for (Animal animal: horde)
		{
			System.out.println(animal);
			System.out.println(animal.HowManyLegs());
		}
		

	}

}
