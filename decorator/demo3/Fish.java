package design.decorator.demo3;

public class Fish extends Change{

	public Fish(TheGreatestSage theGreatestSage) {
		super(theGreatestSage);
	}

	@Override
	public void move() {
		  System.out.println("Fish Move");
	}
	
	public void swim(){
		System.out.println("swim swim swim");
	}
}
