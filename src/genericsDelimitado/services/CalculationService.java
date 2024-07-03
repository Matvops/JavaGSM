package genericsDelimitado.services;

import java.util.Collections;
import java.util.List;


public class CalculationService<T> implements Calculation {
	@Override
	public <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty())
			throw new IllegalStateException("Lista está vazia!");

		T max = list.get(0);
		for(T x: list) {
			if(x.compareTo(max) > 0) {
				max = x;
			}
		}
		return max;
	}

	

	

}
