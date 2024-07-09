package exercicioSet.entities;

import java.util.Objects;

public abstract class Pessoa {
	private String nome;
	private Integer code;
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.code = this.hashCode();
	}

	public String getNome() {
		return nome;
	}

	public Integer getCode() {
		return code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return code == other.code;
	}

	
	
	
}
