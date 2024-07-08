package exemplo.entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class Site {
	private Set<User> users = new TreeSet<>();

	public void interfaceLogin() {
		
	}


	public Set<User> getUsers() {
		return users;
	}
	
}
