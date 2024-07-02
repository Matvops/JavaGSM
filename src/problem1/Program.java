package problem1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		PrintService<Object> ps = new PrintService<>();
		try {
			System.out.print("How many values: ");
			int n = sc.nextInt();
			sc.nextLine();
			if(n < 0) 
				throw new Exception("Digite um valor maior que 0");
			
			for(int i = 0; i < n; i++) {
				ps.addValue(sc.nextInt());
				sc.nextLine();
			}
			
			ps.print();
			System.out.println("First: " + ps.first());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		
		
	}

}
