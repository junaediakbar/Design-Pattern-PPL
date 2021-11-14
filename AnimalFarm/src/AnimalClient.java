
public class AnimalClient {
	public static void main(String[] args) {
		AnimalCreator animalCreator = new AnimalCreator();	 
		Animal[] animalFarm = new Animal[12];	
		animalFarm[0] = animalCreator.retrieveAnimal("Chicken");
		animalFarm[1] = animalCreator.retrieveAnimal("Chicken");	
		animalFarm[2] = animalCreator.retrieveAnimal("Chicken");	
		animalFarm[3] = animalCreator.retrieveAnimal("Chicken");	
		animalFarm[4] = animalCreator.retrieveAnimal("Chicken");	
		animalFarm[5] = animalCreator.retrieveAnimal("Sheep");	
		animalFarm[6] = animalCreator.retrieveAnimal("Sheep");	
		animalFarm[7] = animalCreator.retrieveAnimal("Sheep");	
		animalFarm[8] = animalCreator.retrieveAnimal("Sheep");	
		animalFarm[9] = animalCreator.retrieveAnimal("Sheep");	
		animalFarm[10] = animalCreator.retrieveAnimal("Sheep");	
		
		for (int i= 0; i<=10; i++) {	
			System.out.println(animalFarm[i].helloAnimal());	
		} // for
	}
}
