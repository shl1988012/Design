package design.decorator.demo1;

public class ComponentDecoratorB  extends ComponentDecorator{

	public ComponentDecoratorB(Component component) {
		super(component);
	}
	
	public void display() {
		super.display();
		addFun();
	}
	
	public void addFun(){
		System.out.println("装饰2的功能调用");
	}
	
}
