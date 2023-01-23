package GenericsAss;
import java.util.HashSet;

public class Employee {
	
	int id, salary;
	String name, dept;
	public Employee(int id, String name, int salary, String dept) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
    
	public void displayDetails() {
		System.out.println("Id="+id+"\n"+"Name="+name+"\n"+"Salary="+salary+"\n"+"Departments="+dept);
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee(46290037, "Saritha", 28000, "JSF react");
		Employee emp2 = new Employee(46290038,"Githika", 28000, "JSF react");
		Employee emp3 = new Employee(46288441,"Haritha", 28000, "JSF react");
		Employee emp4 = new Employee(46283048,"Lakshmi", 28000, "JSF react");

	}
    
	HashSet<Employee> empSet = new HashSet<Employee>();
	
	empSet.add(emp1);
	empset.add(emp2);
	empset.add(emp3);
	empset.add(emp4);
	empSet.foreach(n->displayDetails());
	
}
