
public class Sheep extends Animal{
	private int numberOfClones = 0;
	public String helloAnimal() {
		StringBuffer sheepTalk = new StringBuffer();
		sheepTalk.append("Meeeee world, I am");
		sheepTalk.append(name);
		return sheepTalk.toString();
	}
	
	public Sheep clone() {
		Sheep clonedSheep = (Sheep) super.clone();
		String sheepName= clonedSheep.getName();
		clonedSheep.setName(sheepName + " "+  numberOfClones);
		numberOfClones++;
		return clonedSheep;
	}
}
