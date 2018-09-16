package lab4;

public class Rectangle {

	private double width = 1;
	private double height = 1;
	private static String color = "white";

	public Rectangle() {
	}

	public Rectangle(double width, double height, String color) {
		this.setWidth(width);
		this.setHeight(height);
		this.setColor(color);
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		Rectangle.color = color;
	}

	public double findArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(10.5, 8, "Red");
		
		rect1.setColor("Yellow");
		rect1.setWidth(12);
		rect1.setHeight(5.5);
		
		System.out.printf("Rectangle 1 : %.2f x %.2f = %.2f (%s)\n", rect1.getWidth(), rect1.getHeight(), rect1.findArea(), rect1.getColor());
		System.out.printf("Rectangle 2 : %.2f x %.2f = %.2f (%s)\n", rect2.getWidth(), rect2.getHeight(), rect2.findArea(), rect2.getColor());

	}

}
