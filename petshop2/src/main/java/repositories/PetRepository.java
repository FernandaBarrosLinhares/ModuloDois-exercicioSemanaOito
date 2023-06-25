package repositories;

import java.util.ArrayList;
import java.util.List;

import models.Pet;

public class PetRepository {
	private static List<Pet> pets = new ArrayList<>();
	private  static int petSequence = 0;
	
	public void cadastra (Pet pet) {
		pet.setId(incrementaSequence());
		pets.add(pet);
	}
	
	private static int incrementaSequence() {
		return ++petSequence;
		
	}
	public List<Pet> busca(){
		return pets;
	}

}
