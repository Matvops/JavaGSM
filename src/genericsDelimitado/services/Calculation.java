package genericsDelimitado.services;

import java.util.List;

public interface Calculation {
	public <T> void max(List<T> list);
}
