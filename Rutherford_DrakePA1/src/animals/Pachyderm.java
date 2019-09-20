package animals;

public abstract class Pachyderm extends Animal
{

	public Pachyderm(String name)
	{
		super(name);
	}

	@Override
	public String eat()
	{
		return "munches on some grass.";
	}

	@Override
	public String roam()
	{
		return "wanders around and contemplates how the Pachydermata order is obsolete among zoologists.";
	}

}
