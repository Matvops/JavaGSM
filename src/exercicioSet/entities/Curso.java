package exercicioSet.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Curso {
	private String nome;
	private Professor professor;
	private Set<Aluno> alunos = new HashSet<>();
	
	public Curso(String nome, Professor professor) {
		this.nome = nome;
		this.professor = professor;
	}

	public Curso(String nome) {
		this.nome = nome;
	}  
	
	public String getNome() {
		return nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n-----------------------\n");
		sb.append("CURSO: " + this.nome);
		sb.append("\nNOME PROFESSOR: " + this.professor.getNome());
		sb.append("\nNÚMERO DE ALUNOS: " + this.alunos.size());
		sb.append("\n-----------------------\n");
		return sb.toString();
	}
	
	
}
