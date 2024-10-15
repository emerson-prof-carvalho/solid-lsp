package model;

public class Rectangle implements Shape {
	protected Double width;
	protected Double height;

	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public Double getHeight() {
		return height;
	}

	@Override
	public Double getArea() {
		return width * height;
	}
}
