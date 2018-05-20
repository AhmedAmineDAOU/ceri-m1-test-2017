package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentTest;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.ISpecieTest;

public class EnvironmentTest extends IEnvironmentTest{

	@Override
	public IEnvironment getIEnvironmentInstance() {
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.createMock(1899, true, false, true));				
		List<ISpecie> species = new ArrayList<ISpecie>();
		species.add(ISpecieTest.getTestInstanceStatic(3));
		return new Environment( "EnvName", 1, species) ;
	}
}