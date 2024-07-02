package problem1;

import java.util.LinkedList;
import java.util.List;

public class PrintService <T>{
	List<T> list = new LinkedList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty())
			throw new IllegalStateException("Lista vazia!");
		return list.get(0);
	}
	
	public void print() {
		System.out.println(list.toString());
	}
}
