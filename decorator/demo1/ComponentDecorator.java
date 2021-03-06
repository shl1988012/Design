package design.decorator.demo1;

//构件装饰类：抽象装饰类
public class ComponentDecorator extends Component{

	private Component component;
	
	public ComponentDecorator(Component component){
		this.component = component ;
	}
	
	@Override
	public void display() {
		component.display();
	}
	
	
}
