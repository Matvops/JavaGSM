package exercicioSet.entities;

import java.util.HashSet;
import java.util.Set;

public class Aluno extends Pessoa{
	Set<Curso> cursos = new HashSet<>();
	
	public Aluno(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	 



	public Set<Curso> getCursos() {
		return cursos;
	}

	
}
