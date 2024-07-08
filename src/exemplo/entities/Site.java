package exemplo.entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import exemplo.services.Login;

public class Site {
	private Set<User> users = new TreeSet<>();
	private Login lg = new Login();
	
	public void interfaceLogin() {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Enter file full path: ");
		String strPath = sc.nextLine();
		users.addAll(lg.acessarArquivo(strPath));
		System.out.println("Total users: " + users.size());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
	}

	public Set<User> getUsers() {
		return users;
	}
	
}
