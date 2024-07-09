package exercicioSet.entities;

import java.util.Scanner;

import exercicioSet.services.SystemService;

public class Portal {


	public void interfacePortal() {
		Scanner sc = new Scanner(System.in);
		
		try {
			int resp;
			while (true) {
				System.out.println("ESCOLHA: ");
				System.out.println("[0] SAIR");
				System.out.println("[1] IMPRIMIR CURSOS E INFOS");
				System.out.println("[2] TOTAL ALUNO POR CURSO");
				System.out.println("[3] TOTAL ALUNO POR PROFESSOR");
				System.out.println("[4] ADICIONAR CURSO");
				System.out.println("[5] MATRICULAR ALUNO EM UM CURSO");
				resp = sc.nextInt();
				sc.nextLine();
				if(resp == 0)
					break;
				else if(resp == 1) {
					SystemService.imprimirCursos();
				} else if(resp == 2) {
					System.out.println("NOME DO CURSO: ");
					String n = sc.nextLine();
					SystemService.imprimirCurso(n);
				} else if(resp == 3) {
					SystemService.professorSize();
				} else if(resp == 4) {
					System.out.println("DIGITE O NOME DO CURSO: ");
					String n = sc.nextLine();
					
					System.out.println("DIGITE O NOME DO PROFESSOR: ");
					String np = sc.nextLine();
					
					SystemService.addCurso(n, np);
				} else if(resp == 5) {
					System.out.println("Código do aluno: ");
					int code = sc.nextInt();
					sc.nextLine();
					
					System.out.println("DIGITE O NOME DO CURSO: ");
					String n = sc.nextLine();
					
					SystemService.matricular(code, n);
				} else {
					throw new IllegalArgumentException("Número inválido");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
