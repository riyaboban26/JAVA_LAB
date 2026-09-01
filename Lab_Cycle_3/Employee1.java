public class  Employee{
	String name;
	double salary;
	final String company;
	
	Employee(String name,double salary, String company){
		this.name=name;
		this.salary = salary;
		this.company = company;
	}
	
	double calculateBonus(){
		return salary * 0.5;
	}
}


class Manager extends Employee{
	Manager(String name,double salary, String company){
		super(name, salary,company);
	}
	
	double calculateBonus(){
		return salary * 0.10;
	}
}

class SeniorManager extends Employee{
	SeniorManager(String name,double salary, String company){
		super(name, salary,company);
	}
	
	double calculateBonus(){
		return (salary * 0.15)+ 15000;
	}
}
public class Employee1{
	public static void main(String[] args){
		SeniorManager sm = new SeniorManager("Riya",25000,"ABC Company");
		System.out.println("Name: " + sm.name);
		System.out.println("Salary: " + sm.salary);
		System.out.println("Company: " + sm.company);
		System.out.println("Bonus: " + sm.calculateBonus());
	}
}
		
 {
    
}
