package design.chain.purchase;


public abstract class Approver {

	protected Approver successor ; // 定义后继对象
	protected String name; //审批者姓名  
	
	public Approver(String name) {  
        this.name = name;  
    }


	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	//抽象请求处理方法  
    public abstract void processRequest(PurchaseRequest request);  	
	
}
