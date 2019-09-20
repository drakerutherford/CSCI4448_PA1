package animals;

public class Wolf extends Canine
{

	public Wolf(String name)
	{
		super(name);
		type = "wolf";
	}

	@Override
	public String makeNoise()
	{
		return "howls.";
	}

}
