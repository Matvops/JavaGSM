package curingas.entities;

public class Rectangle implements Shape{
	private Integer width, height;
	
	
	public Rectangle(Integer width, Integer height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public Integer area() {
		return this.height * this.width;
		
	}

	public Integer getWidth() {
		return width;
	}

	public Integer getHeight() {
		return height;
	}

}
