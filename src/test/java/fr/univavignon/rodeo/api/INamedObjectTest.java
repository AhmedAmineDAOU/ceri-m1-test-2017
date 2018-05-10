package fr.univavignon.rodeo.api;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class INamedObjectTest {

	
	public static INamedObject createMock() {
		INamedObject iNamedObject = mock(INamedObject.class);
        when(iNamedObject.getName()).thenReturn("MioNome");
		return  iNamedObject;
	}	
	
	
	
	@Test
	public void testGetName() {
        assertEquals(createMock().getName(), "MioNome");

}
}
