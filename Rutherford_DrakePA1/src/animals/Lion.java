package animals;

public class Lion extends Feline
{

	public Lion(String name)
	{
		super(name);
		type = "lion";
	}

	@Override
	public String makeNoise()
	{
		return "lets out a majestic roar.";
	}

}
