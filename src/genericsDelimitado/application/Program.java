package genericsDelimitado.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import genericsDelimitado.entities.Product;
import genericsDelimitado.services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		File path = new File("C:\\temp\\ws-eclipse\\generics\\genericDelimitado.txt");
		List<Product> list = new LinkedList<>();
		CalculationService<Product> cs = new CalculationService<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				String val[] = line.split(",");
				list.add(new Product(val[0], Double.parseDouble(val[1])));
				line = br.readLine();
			}
			cs.max(list);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
