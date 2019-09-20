package animals;

public class Dog extends Canine
{

	public Dog(String name)
	{
		super(name);
		type = "dog";
	}

	@Override
	public String makeNoise()
	{
		return "barks.";
	}

}
