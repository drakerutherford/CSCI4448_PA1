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
		return super.name + " lets out a majestic roar.";
	}

}
