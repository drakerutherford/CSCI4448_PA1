package animals;

public abstract class Canine extends Animal
{

	public Canine(String name)
	{
		super(name);
	}

	@Override
	public String eat()
	{
		return "eats a steak.";
	}

	@Override
	public String roam()
	{
		return "chases its own tail.";
	}

}
