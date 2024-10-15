package model;

public class Square implements Shape {
	private Double side;

	public Square(Double side) {
		this.side = side;
	}

	public Double getSide() {
		return side;
	}

	@Override
	public Double getArea() {
		return side * side;
	}
}