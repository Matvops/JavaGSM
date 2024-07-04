package curingas.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		copy(myInts, myObjs);
		System.out.println(myObjs.toString());
		copy(myDoubles, myObjs);
		System.out.println(myObjs.toString());
	}
	
	public static void copy(List<? extends Number> list, List<? super Number> listO) {
		if(!listO.isEmpty()) {
			listO.removeAll(listO);
		}
		listO.addAll(list);
	}

}
