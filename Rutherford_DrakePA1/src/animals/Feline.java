package animals;

public abstract class Feline extends Animal
{

	public Feline(String name)
	{
		super(name);
	}

	@Override
	public String eat()
	{
		return "eats some meat with its claws.";
	}

	@Override
	public String roam()
	{
		return "stalks its imaginary jungle.";
	}

}
