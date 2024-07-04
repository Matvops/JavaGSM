package curingas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curingas.entities.Circle;
import curingas.entities.Rectangle;
import curingas.entities.Shape;
import curingas.services.SumAreaServices;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<Shape>();
		int r;
		try {
			while (true) {
				System.out.println("ESCOLHA:");
				System.out.println("[0] SAIR");
				System.out.println("[1] ADICIONAR CIRCULO");
				System.out.println("[2] ADICIONAR RETANGULO");
				System.out.println("[3] MOSTRAR SOMA DAS ÁREAS");
				r = sc.nextInt();
				sc.nextLine();
				if (r == 0)
					break;
				else if (r == 1) {
					System.out.print("DIGITE O RAIO DO CIRCULO: ");
					Integer raio = sc.nextInt();
					sc.nextLine();
					shapes.add(new Circle(raio));
				} else if (r == 2) {
					System.out.print("DIGITE A ALTURA DO RETANGULO: ");
					Integer alt = sc.nextInt();
					sc.nextLine();
					System.out.print("DIGITE A LARGURA DO RETANGULO: ");
					Integer wid = sc.nextInt();
					sc.nextLine();
					shapes.add(new Rectangle(wid, alt));
				} else if (r == 3) {
					int soma = new SumAreaServices().totalArea(shapes);
					System.out.println("Soma das areas: " + soma);
				} else {
					throw new IllegalArgumentException("Opção inválida");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
