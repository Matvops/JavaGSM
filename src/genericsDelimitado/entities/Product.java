package genericsDelimitado.entities;

public class Product {
	private String name;
	private Double value;
	
	public Product(String name, Double value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public Double getValue() {
		return value;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append("," + String.format("%.2f", this.value));
		return sb.toString();
	}
	
	
}
