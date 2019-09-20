package animals;

public class Rhino extends Pachyderm
{

	public Rhino(String name)
	{
		super(name);
		type = "rhino";
	}

	@Override
	public String makeNoise()
	{
		return "makes a sad sound because its species is going extinct.";
	}

}
