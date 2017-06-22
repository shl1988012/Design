package design.chain.approveleave;

//总经理
public class GeManager extends Approver{

	public GeManager(String name) {
		super(name);
	}

	@Override
	public void processRequest(LeaveRequest request) {
		if(request.getDateNum()<30){
			System.out.println("总经理审批成功，请假天数为："+request.getDateNum());
		}else{
			this.successor.processRequest(request);
		}
	}
	
}
