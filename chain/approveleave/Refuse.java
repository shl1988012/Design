package design.chain.approveleave;

public class Refuse extends Approver{

	public Refuse(String name) {
		super(name);
	}

	@Override
	public void processRequest(LeaveRequest request) {
			System.out.println("审批被拒绝，请假天数为："+request.getDateNum());
	}
	
}
