package Objectoriented;
abstract class Shape
{
   abstract void draw();
}
class Line extends Shape{
	void draw() {
		System.out.println("Draw shapes in lines");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Draw shapes in rectangle");
	}
}
class Cube extends Shape{
	void draw() {
		System.out.println("Draw shapes in cube");
	}
}

class Shapetext{
	public static void main(String[] args) {
		Line line=new Line();
		line.draw();
		Rectangle rect=new Rectangle();
		rect.draw();
		Cube cube=new Cube();
		cube.draw();
		
	}

}
