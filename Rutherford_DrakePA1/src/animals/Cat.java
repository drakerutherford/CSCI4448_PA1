package animals;

public class Cat extends Feline
{

	public Cat(String name)
	{
		super(name);
		type = "cat";
	}

	/* Cats have a 50% chance to ignore a command. String action represents what the cat would normally do if 
	 * it didn't ignore the command. */
	private String maybeDo(String action) 
	{
		double chance = Math.random();
		if (chance < 0.5) return action;
		else return "ignores the command.";
	}
	
	@Override 
	public String wakeup()
	{
		return maybeDo("wakes up.");
	}
	
	@Override
	public String sleep()
	{
		return maybeDo("falls asleep.");
	}
	
	@Override
	public String eat()
	{
		return maybeDo("eats some meat with its claws.");
	}
	
	@Override
	public String roam()
	{
		return maybeDo("stalks its imaginary jungle.");
	}
	
	@Override
	public String makeNoise()
	{
		return maybeDo("hisses and coughs up a furball.");
	}

}
