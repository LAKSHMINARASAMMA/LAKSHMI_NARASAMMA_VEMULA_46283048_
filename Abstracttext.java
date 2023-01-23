package Objectoriented;

abstract class Abstract {
	 public abstract void display();
}
class Abs extends Abstract{
	public void display() {
		System.out.println("This is Abstraction assignments");
	}
}
class Abstracttext{
	public static void main(String[] args) {
		Abs obj=new Abs();
		obj.display();
		 
	}		
}