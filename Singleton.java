package Objectoriented;
class Singleton1 {
	private static Singleton1 a = new Singleton1();
    private Singleton1() {}
    public static Singleton1 getInstance()
	 {
        return a;
    }
}
class Singleton{
public static void main(String[] args)
{
    Singleton singleton= new Singleton();
}
}