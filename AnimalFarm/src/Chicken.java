
public class Chicken extends Animal{
	private int numberOfClones = 0;
	public String helloAnimal() {
		StringBuffer chickenTalk = new StringBuffer();
		chickenTalk.append("Cluck cluck world, I am");
		chickenTalk.append(name);
		return chickenTalk.toString();
	}
	
	public Chicken clone() {
		Chicken clonedChicken = (Chicken) super.clone();
		String chickenName= clonedChicken.getName();
		clonedChicken.setName(chickenName + " "+ numberOfClones);
		numberOfClones++;
		return clonedChicken;
	}
}
