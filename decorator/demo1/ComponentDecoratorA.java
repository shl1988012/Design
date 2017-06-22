package design.decorator.demo1;

public class ComponentDecoratorA extends ComponentDecorator {

	public ComponentDecoratorA(Component component) {
		super(component);
	}

	public void display() {
		super.display();
		addFun();
	}
	
	public void addFun(){
		System.out.println("装饰1的功能调用");
	}
	
}
