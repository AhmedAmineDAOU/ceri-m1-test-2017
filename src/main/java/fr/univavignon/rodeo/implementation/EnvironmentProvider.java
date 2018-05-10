package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class EnvironmentProvider implements IEnvironmentProvider {

	private ArrayList<IEnvironment> environments;

	public EnvironmentProvider(ArrayList<IEnvironment> env) {
		environments =new ArrayList<IEnvironment>(env);
		
	}
	public List<String> getAvailableEnvironments() {
		List<String> avalableE = new ArrayList<String>();
		
		for (IEnvironment environment : environments) {
			 avalableE.add(environment.getName());
		}
		return  avalableE;
	}

	public IEnvironment getEnvironment(String name) throws IllegalArgumentException {
		
		if (name==null) {
			throw new IllegalArgumentException();
		}else {
			for (IEnvironment environment : environments) 
				if (environment.getName().equals(name))
					return environment;
			
		}
		return null;
	}


}
