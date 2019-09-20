package zoo;

import java.util.ListIterator;

import animals.*;

public class ZooKeeper
{
	/* convenience method to return an animal's name and type as a string */
	private static String animalIdent(Animal a) {
		return a.getName() + " (" + a.getType() + ")";
	}

	public static void wakeAnimals(ListIterator<Animal> animals) {
		System.out.println("The Zookeeper is waking the animals.");
		while (animals.hasNext())  {
			Animal a = animals.next();
			System.out.println(animalIdent(a) + " " + a.wakeup());
		}
	}
	
	public static void rollCallAnimals(ListIterator<Animal> animals) {
		System.out.println("The Zookeeper is performing the rollcall.");
		while (animals.hasNext())  {
			Animal a = animals.next();
			System.out.println(animalIdent(a) + " " + a.makeNoise());
		}
	}
	
	public static void feedAnimals(ListIterator<Animal> animals) {
		System.out.println("The Zookeeper is feeding the animals.");
		while (animals.hasNext())  {
			Animal a = animals.next();
			System.out.println(animalIdent(a) + " " + a.eat());
		}
	}

	public static void exerciseAnimals(ListIterator<Animal> animals) {
		System.out.println("The Zookeeper is letting the animals exercise.");
		while (animals.hasNext())  {
			Animal a = animals.next();
			System.out.println(animalIdent(a) + " " + a.roam());
		}
	}
	
	public static void bedAnimals(ListIterator<Animal> animals) {
		System.out.println("The Zookeeper is putting the animals to sleep (no, not in that way).");
		while (animals.hasNext())  {
			Animal a = animals.next();
			System.out.println(animalIdent(a) + " " + a.sleep());
		}
	}
}
