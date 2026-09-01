class shape{
	protected String name;
	
	shape(String name){
		this.name = name;
	}
	
	void describe(){
		System.out.println(name);
	}
	
}
class circle extends shape{
	int radius;
	circle(int radius, String name){
		super(name);
		this.radius = radius;
	}
	
	void describe(){
		super.describe();
		double area = Math.PI * radius * radius ;
		System.out.println(radius);
		System.out.println(area);
	}
}
public class q2{
	public static void main(String[] args){
		circle c = new circle(5,"Circle");
		c.describe();
	}
}
		