package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;



public class IAnimalTest  {
	
	public static IAnimal createMock(int xp, boolean secret, boolean endagered, boolean boss) {
		IAnimal animalMock = Mockito.mock(IAnimal.class);
		Mockito.when(animalMock.getXP()).thenReturn(xp);
		Mockito.when(animalMock.isSecret()).thenReturn(secret);
		Mockito.when(animalMock.isEndangered()).thenReturn(endagered);
		Mockito.when(animalMock.isBoss()).thenReturn(boss);
		return animalMock;
}
	
	
	protected IAnimal createMock(){
		return createMock(1899,true,false,true);
		
	}
		

	@Test
	public void testgetXP(){
		IAnimal mockAnimal=createMock();
		assertEquals(1899,mockAnimal.getXP());
		
	}
	
	@Test
	public void testIsBoss(){
		IAnimal mockAnimal=createMock();
		assertEquals(true,mockAnimal.isBoss());
		
	}
	
	
	@Test
	public void testIsEndangered(){
		IAnimal mockAnimal=createMock();
		assertEquals(false,mockAnimal.isEndangered());
	}
	
	@Test
	public void testIsSecret(){
		IAnimal mockAnimal=createMock();
		assertEquals(true,mockAnimal.isSecret());
		
	}
	
}
