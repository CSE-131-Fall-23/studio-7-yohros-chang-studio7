package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		area = length * width;
		perimeter = 2 * length + 2 * width;
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hasSmallerArea(Rectangle a, Rectangle b) {
		if (a.area < b.area) {
			return true;
		} else {
			return false;
		}
	}
	
	public void draw() {
		StdDraw.filledRectangle(0.5, 0.5, this.width / 2, this.length / 2);
	}
	
	public String toString() {
		return length + " by " + width + ": " + area + " (area) & " + width + " (perimeter)";
	}
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle(0.5, 0.5);
		System.out.println(a.toString());
	}
	
	
}
