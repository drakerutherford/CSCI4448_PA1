package animals;

public class Tiger extends Feline
{

	public Tiger(String name)
	{
		super(name);
		type = "tiger";
	}

	@Override
	public String makeNoise()
	{
		return "lets out a snarl.";
	}

}
