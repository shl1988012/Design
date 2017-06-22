package design.decorator.demo2;

public class Delete extends Decorator{

	public Delete(Document document) {
		super(document);
	}
	
	public void display(){
		super.display();
	}
	
	public void addFun(){
		System.out.println("增加删除功能");
	}

}
