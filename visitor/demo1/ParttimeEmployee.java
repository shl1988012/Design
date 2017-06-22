package design.visitor.demo1;

//临时工
public class ParttimeEmployee implements Employee{

	private String name;
	private int workTime;
	 private double hourWage; 
	
	public ParttimeEmployee(String name,double hourWage,int workTime){
		this.name = name;  
        this.hourWage = hourWage;  
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

	public double getHourWage() {
		return hourWage;
	}

	public void setHourWage(double hourWage) {
		this.hourWage = hourWage;
	}
	
}
