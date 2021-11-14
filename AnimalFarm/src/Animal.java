
public abstract class Animal implements Cloneable {
	protected int numberOfLegs=0;
	protected String description = "";
	protected String name="";
	
	public abstract String helloAnimal();
	
	public Animal clone() {
		Animal clonedAnimal = null;	
		try {	
			clonedAnimal = (Animal) super.clone();	
			clonedAnimal.setDescription(description);	
			clonedAnimal.setNumberOfLegs(numberOfLegs);	
			clonedAnimal.setName(name);	
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();	
		} // catch	
		return clonedAnimal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs=numberOfLegs;
	}
}
