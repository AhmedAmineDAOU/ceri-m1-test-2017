package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;

public class Animal extends NamedObject implements IAnimal {
	private boolean isBoss,isEndangered,isSecret;
	private int xp;
	
	
	public Animal(String nom, int experience,boolean isB,boolean isE,boolean isS) {
		super(nom);
		xp=experience;
		isBoss=isB;
		isEndangered=isE;
		isSecret=isS;
	}

	
	public int getXP() {
		return xp;
	}

	public boolean isSecret() {
		return isSecret;
	}

	public boolean isEndangered() {
		return isEndangered;
	}

	public boolean isBoss() {
		return isBoss;
	}

}
