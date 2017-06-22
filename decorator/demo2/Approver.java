package design.decorator.demo2;

public class Approver extends Decorator{

	
	public Approver(Document document) {
		super(document);
	}
	
	public void display(){
		super.display();
	}
	
	// display 和 addFun 方法是独立的
	public void addFun(){
		System.out.println("增加审批功能");
	}
	
}
