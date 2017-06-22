package design.chain.approveleave;

//经理
public class Manager  extends Approver{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void processRequest(LeaveRequest request) {
		if(request.getDateNum()<10){
			System.out.println("经理审批成功，请假天数为："+request.getDateNum());
		}else{
			this.successor.processRequest(request);
		}
	}
	
}