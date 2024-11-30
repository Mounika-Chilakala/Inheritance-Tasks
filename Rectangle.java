package com.inheritance;
class Shape{
	public void getArea() {
		System.out.println("This is the Area of the shape");
	}
	public void getPerimeter() {
		System.out.println("This is the perimeter of the shape");
	}
}
class Circle extends Shape{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void getArea() {
		System.out.println("The area of the circle is:"+(Math.PI*radius*radius));
	}
	public void getPerimeter() {
		System.out.println("The perimeter of the circle is:"+(2*Math.PI*radius));
	}
}
public class Rectangle extends Shape{
	double length;
	double  width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public void getArea() {
		System.out.println("The area of the Rectangle is:"+(length*width));
	}
	public void getPerimeter() {
		System.out.println("The perimeter of the Rectangle is:"+(2*(length+width)));
	}
	public static void main(String[] args) {
		Circle c=new Circle(1.5);
		c.getArea();
		c.getPerimeter();
		Rectangle r=new Rectangle(3, 4.2);
		r.getArea();
		r.getPerimeter();
	}

}
