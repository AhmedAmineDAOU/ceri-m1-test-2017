package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class IEnvironmentTest {
	
	private static List<ISpecie> speciesList;
	
	public static IEnvironment createMock(int testAreaNumber) {
		IEnvironment environmentTest = Mockito.mock(IEnvironment.class);
		Mockito.when(environmentTest.getAreas()).thenReturn(testAreaNumber);
		speciesList = new LinkedList<ISpecie>();
		speciesList.add(ISpecieTest.getTestInstanceStatic(2));
		speciesList.add(ISpecieTest.getTestInstanceStatic(4));
		Mockito.when(environmentTest.getSpecies()).thenReturn(speciesList);
		return environmentTest;
	}
	
	
	
	@Test
	public void testGetAreas() {
		assertEquals(createMock(3).getAreas(),3);
	}
	
	@Test
	public void testGetSpecies() {
		assertEquals(createMock(3).getSpecies(),speciesList);
	}
	
	
}