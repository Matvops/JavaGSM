package genericsDelimitado.services;

import java.util.List;

public interface Calculation {
	public <T extends Comparable<T>> T max(List<T> list); //Qualquer tipo T que HERDE/IMPLEMENTE Comparable
}
