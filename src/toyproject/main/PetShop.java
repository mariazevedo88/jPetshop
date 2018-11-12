package toyproject.main;

import toyproject.dto.Animal;
import toyproject.dto.Dog;

public class PetShop {

	
	public static void main(String[] args) {
		
		Dog d = new Dog(true, "Pereira", "Mammal");
		d.setSound("bark");
		d.setRace("pitbul");
		
		printAnimal(d);
	
	}
	
	private static void printAnimal(Animal animal){
		System.out.println(animal.toString());
	}
	
}
