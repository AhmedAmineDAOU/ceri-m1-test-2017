package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import fr.univavignon.rodeo.api.IGameState;


public class IGameStateTest {

	public static IAnimal iAnimal = IAnimalTest.createMock(1, true, true, true);
	public IGameState iGameState =createMock();
	
	public static IGameState  createMock() {
		
		IGameState iGameState = Mockito.mock(IGameState.class);
		Mockito.doThrow(new IllegalStateException()).when(iGameState).exploreArea();
		Mockito.doThrow(new IllegalArgumentException()).when(iGameState).catchAnimal(null);
		Mockito.doThrow(new IllegalStateException()).when(iGameState).catchAnimal(iAnimal);
		return iGameState;
	}
	
	
	
	@Test
	public void testgetProgession(){
		
		when(iGameState.getProgression()).thenReturn(1);
		assertEquals(1, iGameState.getProgression());
	}
	
	

}
