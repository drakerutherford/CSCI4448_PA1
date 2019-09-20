package animals;

public class Hippo extends Pachyderm
{

	public Hippo(String name)
	{
		super(name);
		type = "hippo";
	}

	@Override
	public String makeNoise()
	{
		return "lets out a wide-mouthed roar.";
	}

}
