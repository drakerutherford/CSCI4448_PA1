package animals;

public class Elephant extends Pachyderm
{

	public Elephant(String name)
	{
		super(name);
		type = "elephant";
	}

	@Override
	public String makeNoise()
	{
		return "trumpets with its long trunk.";
	}

}
