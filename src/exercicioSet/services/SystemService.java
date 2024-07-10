package exercicioSet.services;

import java.util.HashSet;
import java.util.Set;

import exercicioSet.entities.Aluno;
import exercicioSet.entities.Curso;
import exercicioSet.entities.Professor;

public class SystemService {
	private static Set<Professor> professores = new HashSet<>();
	private static Set<Aluno> alunos = new HashSet<>();
	private static Set<Curso> cursos = new HashSet<>();

	public static void inicializarAeP() {
		getProfessores().add(new Professor("Alex".toUpperCase()));
		getProfessores().add(new Professor("Marcos".toUpperCase()));
		getAlunos().add(new Aluno("Maria".toUpperCase()));
		getAlunos().add(new Aluno("Ana".toUpperCase()));
		getAlunos().add(new Aluno("Camila".toUpperCase()));
		getAlunos().add(new Aluno("Vitória".toUpperCase()));
		getAlunos().add(new Aluno("Julia".toUpperCase()));
	}

	public static void imprimirCursos() {
		for (Curso c : cursos) {
			System.out.println(c.toString());
		}
	}

	public static void imprimirCurso(String nome) {
		Curso c = cursos.stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
		if (c != null)
			System.out.println("TOTAL: " + c.getAlunos().size());
		else
			throw new IllegalArgumentException("Curso não existe!");
	}

	public static void professorSize() {

		Set<Aluno> a = new HashSet<>();
		for (Professor p : professores) {
			for (Curso c : cursos) {
				if (!c.getProfessor().equals(p)) {
					continue;
				} else {
					a.addAll(c.getAlunos());
				}
			}
			System.out.println(p.getNome() + ": " + a.size());
			a.clear();
		}
	}

	public static void addCurso(String nomeC, Integer code) {
		if (getCursos().contains(new Curso(nomeC.toUpperCase())))
			throw new IllegalArgumentException("Curso existente!");

		Professor p = getProfessores().stream().filter(x -> x.getCode().equals(code)).findFirst().orElse(null);
		
		if (p == null)
			throw new IllegalArgumentException("Professor inexistente!");

		Curso c = new Curso(nomeC.toUpperCase(), p);
		getCursos().add(c);
		p.getCursos().add(c);
	}

	public static void matricular(int code, String nomeC) {
		Curso c = getCursos().stream().filter(x -> x.getNome().equalsIgnoreCase(nomeC)).findFirst().orElse(null);
		Aluno a = getAlunos().stream().filter(x -> x.getCode().equals(code)).findFirst().orElse(null);
		if (a == null)
			throw new IllegalArgumentException("Aluno não encontrado");
		if (c == null)
			throw new IllegalArgumentException("Curso inexistente!");
		c.getAlunos().add(a);
		a.getCursos().add(c);
	}

	
	public static void codes() {
		for(Professor p: professores)
			System.out.println("PROFESSOR " + p.getNome() + ": " + p.getCode());
		
		for(Aluno a: alunos)
			System.out.println("ALUNO " + a.getNome() + ": " + a.getCode());
	}
	public static Set<Professor> getProfessores() {
		return professores;
	}

	public static Set<Aluno> getAlunos() {
		return alunos;
	}

	public static Set<Curso> getCursos() {
		return cursos;
	}

}
