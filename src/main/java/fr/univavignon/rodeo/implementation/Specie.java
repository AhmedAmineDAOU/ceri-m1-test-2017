package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class Specie extends NamedObject implements ISpecie {

	private List<IAnimal> animals;
	private int area;

	public Specie(String nom,int areaa,List<IAnimal> animalList) {
		super(nom);
		animals =new ArrayList<IAnimal>();
		area=areaa;
		animals.addAll(animalList);
	}

	public int getArea() {
		return area;
	}

	public List<IAnimal> getAnimals() {
		return animals;
	}

}