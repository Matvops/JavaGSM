package exemplo.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.TreeSet;

import exemplo.entities.User;

public class Login {
	private Set<User> users = new TreeSet<>();
	private DateTimeFormatter fmt = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
	public Set<User> acessarArquivo(String strPath) {
		File path;
		path = new File(strPath);
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String part[] = line.split(" ");
				users.add(new User(part[0], LocalDateTime.parse(part[1], fmt)));
				line = br.readLine();
			}
			for(User u: users) 
				System.out.println(u.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return users;
	}
}
