package design.decorator.demo1;


public class Client {
	
	
	public static void main(String[] args) {
		
		Component window = new Window();
		
		Component decoratorA = new ComponentDecoratorA(window);
		decoratorA.display();
		
		Component decoratorB = new ComponentDecoratorB(decoratorA);
		decoratorB.display();
		
	}
}
