package demoMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> cookies = new TreeMap<>();
		String user, phone, email;
		int i = 0;
		while(i < 5) {
			System.out.print("Digite o nome: ");
			user = sc.nextLine();
			System.out.print("Digite o phone: ");
			phone = sc.nextLine();
			System.out.print("Digite o email: ");
			email = sc.nextLine();
			cookies.put("user", user);
			cookies.put("phone", phone);
			cookies.put("email", email);
			for(String key: cookies.keySet()) {
				System.out.println(key + ": " + cookies.get(key));
			}
			i++;
		}
		sc.close();
	}

}
