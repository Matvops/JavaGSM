package exercicioSet.entities;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Pessoa{
	Set<Curso> cursos = new HashSet<>();
	
	public Professor(String nome) {
		super(nome);
	}

	public Set<Curso> getCursos() {
		return cursos;
	}
	
	
}
