package design.chain.approveleave;

//主任
public class Director extends Approver{

	public Director(String name) {
		super(name);
	}

	@Override
	public void processRequest(LeaveRequest request) {
		if(request.getDateNum()<3){
			System.out.println("主任审批成功，请假天数为："+request.getDateNum());
		}else{
			this.successor.processRequest(request);
		}
	}
	
}
