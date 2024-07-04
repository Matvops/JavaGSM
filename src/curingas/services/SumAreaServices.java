package curingas.services;

import java.util.List;

import curingas.entities.Shape;

public class SumAreaServices implements AreaServices{

	@Override
	public int totalArea(List<? extends Shape> list) {
		int soma = 0;
		
		for(Shape x: list) {
			soma += x.area();
		}
		return soma;
	}

}
