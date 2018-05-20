package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.*;

public class IGameStateProviderTest {
	
	private static IGameState gameState;
	
	public  IGameStateProvider createMock() {
		IGameStateProvider gameStateProvider = Mockito.mock(IGameStateProvider.class);
		gameState = IGameStateTest.createMock();
		Mockito.when(gameStateProvider.get("name")).thenReturn(gameState);
		Mockito.when(gameStateProvider.get(null)).thenThrow(new IllegalArgumentException());
		return gameStateProvider;
}
	@Test
	public void testGet() {
		
		assertEquals(createMock().get("name"),gameState);
	}

	
	
}
