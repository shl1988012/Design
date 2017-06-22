package design.chain.approveleave;

public abstract class Approver {

	private String name ; //审批者姓名
	
	protected Approver successor ; // 定义后继对象
	
	public Approver(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}
	
	//抽象请求处理方法  
    public abstract void processRequest(LeaveRequest request);  	
	
	
}
