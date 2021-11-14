
public class AnimalCreator {
	private Animal sheep=new Sheep();
	private Animal chicken = new Chicken();
	
	public AnimalCreator() {
		sheep.setName("sheep");
		sheep.setDescription("Berbulu domba");
		sheep.setNumberOfLegs(4);
		chicken.setName("chicken");
		chicken.setDescription("suka matuk");
		chicken.setNumberOfLegs(2);		
	}
	public Animal retrieveAnimal(String kindOfAnimal) {	
	 	if ("Chicken".equals(kindOfAnimal)) {	 
			return (Animal) chicken.clone();	
		} else if ("Sheep".equals(kindOfAnimal)) {	
			return (Animal) sheep.clone();	
		} // if	

		return null; 
	} // method retrieveAnimal
}
