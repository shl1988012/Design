package design.chain.approveleave;


//Sunny软件公司的OA系统需要提供一个假条审批模块：如果员工请假天数小于3天，主任可以审批该假条；
//如果员工请假天数大于等于3天，小于10天，经理可以审批；
//如果员工请假天数大于等于10天，小于30天，总经理可以审批；
//如果超过30天，总经理也不能审批，提示相应的拒绝信息。
//试用职责链模式设计该假条审批模块。
public class Client {

	public static void main(String[] args) {
		Approver zhuren,jingli,zongjingli,jujue;
		
		zhuren =new Director("主任");
		jingli = new Manager("经理");
		zongjingli = new GeManager("总经理");
		jujue = new Refuse("拒绝");
		
		//添加链条
		zhuren.setSuccessor(jingli);
		jingli.setSuccessor(zongjingli);
		zongjingli.setSuccessor(jujue);
		
		LeaveRequest leaveRequest1 = new LeaveRequest(2);
		zhuren.processRequest(leaveRequest1);
		
		LeaveRequest leaveRequest2 = new LeaveRequest(5);
		zhuren.processRequest(leaveRequest2);
		
		LeaveRequest leaveRequest3 = new LeaveRequest(12);
		zhuren.processRequest(leaveRequest3);
		
		LeaveRequest leaveRequest5 = new LeaveRequest(32);
		zhuren.processRequest(leaveRequest5);
	}
}
