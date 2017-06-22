package design.visitor.demo1;

//全职员工类：具体元素类  
public class FulltimeEmployee implements Employee{

	private String name;
	private int workTime;
	private double weeklyWage;
	
	public FulltimeEmployee(String name,double weeklyWage,int workTime){
		this.name = name;  
        this.weeklyWage = weeklyWage;  
        this.workTime = workTime; 
	}
	
	@Override
	public void accept(Department handler) {
		 handler.visit(this); //调用访问者的访问方法  
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWorkTime() {
		return workTime;
	}


	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}


	public double getWeeklyWage() {
		return weeklyWage;
	}


	public void setWeeklyWage(double weeklyWage) {
		this.weeklyWage = weeklyWage;
	}

	
	
}
