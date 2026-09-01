class Animal{
	String name;
	
	Animal(String name){
		this.name = name;
	}
	void makeSound(){
		System.out.println("Animal makes Sound");
	}
	
	public String toString(){
		return name;
	}
}

class Dog extends Animal{
	
	Dog(String name){
		super(name);
	}
	
	void makeSound(){
		System.out.println("Bark");
	}
	
	public String toString(){
		return super.toString() + " dog";
	}
}
public class Animal1{
	public static void main(String[] args){
		Dog d1 = new Dog("Riah");
		d1.makeSound();
		System.out.println(d1);
	}
}