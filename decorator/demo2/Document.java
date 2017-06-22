package design.decorator.demo2;


//在Sunny软件公司开发的Sunny OA系统中，采购单(PurchaseRequest)和请假条(LeaveRequest)等文件(Document)对象都具有显示功能，
//	现在要为其增加审批、删除等功能，使用装饰模式进行设计。
public interface Document {
	public void display();
	
}
