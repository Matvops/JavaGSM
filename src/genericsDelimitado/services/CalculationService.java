package genericsDelimitado.services;

import java.util.Collections;
import java.util.List;

public class CalculationService<T> implements Calculation, Comparable<T> {

	@Override
	public <T> void max(List<T> list) {
		if (list.isEmpty())
			throw new IllegalStateException("Lista está vazia!");

		T max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			synchronized (list) {
				
			}
		}
	}

	@Override
	public int compareTo(T o) {
		return this.compareTo(o);
	}

}
