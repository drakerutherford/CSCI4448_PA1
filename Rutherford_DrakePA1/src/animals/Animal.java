package animals;

public abstract class Animal
{
	protected String name;
	protected String type;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract String makeNoise();
	public abstract String eat();
	public abstract String roam();
	
	public String wakeup() {
		return "wakes up.";
	}
	public String sleep() {
		return "falls asleep.";
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
}