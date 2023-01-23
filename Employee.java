package Objectoriented;
class Employee1{
	public void salary(long salary) {
    System.out.println("salary: "+salary);
}
}
class Labour extends Employee{
	public void salary(long salary,long overtime) {
       
        salary = salary + overtime;
        System.out.println("salary of Labour:" + salary);
    }
	
}

class Manager extends Employee {
	 public void salary(long salary,long incentive)
	    {
	        
	        salary=salary+incentive;
	        System.out.println("salary of Manager:"+salary);
	    }
	
}
public class Employee{
public static void main(String[] args) {
	Employee1 obj=new Employee1();
	Manager obj1=new Manager();
    Labour obj2= new Labour();
    obj.salary(10000);
    obj1.salary(10000,500);
    obj2.salary(10000,200);
    
    
}
}




