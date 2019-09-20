package zoo;

import java.util.ArrayList;
import java.util.ListIterator;

import animals.*;

public class Zoo
{
	private ArrayList<Animal> animals;
	
	public Zoo()
	{
		animals = new ArrayList<Animal>();
		animals.add(new Cat("Charlie"));
		animals.add(new Cat("Chloe"));
		animals.add(new Dog("Douglas"));
		animals.add(new Dog("Diane"));
		animals.add(new Elephant("Ellis"));
		animals.add(new Elephant("Emma"));
		animals.add(new Hippo("Henry"));
		animals.add(new Hippo("Henrietta"));
		animals.add(new Lion("Louis"));
		animals.add(new Lion("Lilly"));
		animals.add(new Rhino("Ron"));
		animals.add(new Rhino("Rachel"));
		animals.add(new Tiger("Trevor"));
		animals.add(new Tiger("Tina"));
		animals.add(new Wolf("Winston"));
		animals.add(new Wolf("Wanda"));
	}
	
	public ListIterator<Animal> getIterator() {
		return animals.listIterator();
	}
}
