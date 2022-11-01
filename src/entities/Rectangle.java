package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return width + width + height + height;
	}
	
	public double Diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
