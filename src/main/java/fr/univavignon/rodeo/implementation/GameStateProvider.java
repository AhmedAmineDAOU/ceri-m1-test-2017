package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;


public class GameStateProvider implements IGameStateProvider{

	private ArrayList<IGameState> iGameStates;
	
	public GameStateProvider() {
		iGameStates= new ArrayList<IGameState>();
	}
	public void save(IGameState gameState) {
		
	}

	public IGameState get(String name)  {
		try {
			if (name==null);
			for (IGameState iGameState : iGameStates)
				if (iGameState.getName().equals(name))
					return iGameState;
		
			IGameState tmp = new GameState("myName");
			iGameStates.add(tmp);
			return tmp;
		
			}catch(IllegalArgumentException e) {
				e.printStackTrace();
			}
			return null;
	}

}