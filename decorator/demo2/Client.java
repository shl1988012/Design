package design.decorator.demo2;

public class Client {
	
	
	public static void main(String[] args) {
		
		Document  doc  = new PurchaseRequest();
		
		Approver approver = new Approver(doc);
		
		approver.display();
		//为了能够调用到新增方法，我们不得不用具体装饰类型来定义装饰之后的对象，
		//而具体构件类型还是可以使用抽象构件类型来定义，这种装饰模式即为半透明装饰模式
		approver.addFun();
		
		Delete d = new Delete(doc);
		d.addFun();
	}

}
