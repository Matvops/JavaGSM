package curingas.services;

import java.util.List;

import curingas.entities.Shape;

public interface AreaServices {
	public int totalArea(List<? extends Shape> list);
}
