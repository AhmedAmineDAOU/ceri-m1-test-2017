package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;

public class AnimalTest extends IAnimalTest{
	
	@Override
	public  IAnimal getMock() {
		return  new Animal("Animo",1899,true,false,true);
	}
	
}
