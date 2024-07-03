package curingas.entities;

public class Circle implements Shape{
	private Integer radius;
	
	public Circle(Integer radius) {
		this.radius = radius;
	}


	@Override
	public Integer area() {
		return (int) Math.PI * this.radius * this.radius;
		
	}

	public Integer getRadius() {
		return radius;
	}

	
}
