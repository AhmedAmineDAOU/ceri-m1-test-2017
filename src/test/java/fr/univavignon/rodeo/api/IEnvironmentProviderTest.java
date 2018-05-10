package fr.univavignon.rodeo.api;
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {
	
	private static List<String> environmentsList;
	private static IEnvironment environment;
	
	public static IEnvironmentProvider createMock() {
		
		IEnvironmentProvider environmentProviderTest = Mockito.mock(IEnvironmentProvider.class);
		
		environmentsList = new LinkedList<String>();
		environmentsList.add("list");
		
		Mockito.when(environmentProviderTest.getAvailableEnvironments()).thenReturn(environmentsList);
		
		environment = IEnvironmentTest.createMock(4);
		
		Mockito.when(environmentProviderTest.getEnvironment("name")).thenReturn(environment);
		Mockito.when(environmentProviderTest.getEnvironment(null)).thenThrow(new IllegalArgumentException());
		
		
		return environmentProviderTest;
	}
	
	
	@Test
	public void testGetAvailableEnvironments() {
		assertEquals(createMock().getAvailableEnvironments(),environmentsList);
	}
	
	@Test
	public void testgetEnvironment() {
		assertEquals(createMock().getEnvironment("name"),environment);
	}

}