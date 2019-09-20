package main;

import zoo.*;

public class Main
{
	public static void main(String[] args)
	{
		/* Simply instantiate the zoo and give the iterator to the zookeeper to perform all the tasks */
		Zoo z = new Zoo();
		ZooKeeper.wakeAnimals(z.getIterator());
		ZooKeeper.rollCallAnimals(z.getIterator());
		ZooKeeper.feedAnimals(z.getIterator());
		ZooKeeper.exerciseAnimals(z.getIterator());
		ZooKeeper.bedAnimals(z.getIterator());
	}

}
