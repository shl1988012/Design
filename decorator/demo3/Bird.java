package design.decorator.demo3;

public class Bird extends Change{

	public Bird(TheGreatestSage theGreatestSage) {
		super(theGreatestSage);
	}

	@Override
	public void move() {
		System.out.println("bird fly");
	}
	
	
	public void fly(){
		System.out.println("fly fly fly");
	}
}
