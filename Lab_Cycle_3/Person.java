public class person1{
	String name;
	int age;
	
	person1(String name, int age){
		this.name = name;
		this.age = age;
	}
}
class Student extends person1{
	int rollNo;
	int marks;
	
	Student(String name, int age, int rollNo, int marks){
		super(name,age);
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Marks: " + marks);
	}
}
public class Person{
	public static void main(String[] args){
		Student s1= new Student("Riya",23,123,34);
		s1.display();
	}
}
		 {
    
}
