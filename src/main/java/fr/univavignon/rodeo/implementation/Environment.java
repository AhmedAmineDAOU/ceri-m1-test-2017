package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class Environment extends NamedObject implements IEnvironment {

	private int areas;
	private ArrayList<ISpecie> species;

	public Environment(String nom,int ar,List<ISpecie> especes) {
		super(nom);
		species =new ArrayList<ISpecie>();
		areas=ar;
		species.addAll(especes);
	}

	public int getAreas() {
		return areas;
	}

	public List<ISpecie> getSpecies() {
		return species;
}

	public String getName() {
		return null;
	}
}
