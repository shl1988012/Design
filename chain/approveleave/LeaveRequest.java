package design.chain.approveleave;

public class LeaveRequest {

	private int dateNum; //请假天数
	
	public LeaveRequest (int dateNum){
		this.dateNum =dateNum;
	}

	public int getDateNum() {
		return dateNum;
	}

	public void setDateNum(int dateNum) {
		this.dateNum = dateNum;
	}
	
	
}
