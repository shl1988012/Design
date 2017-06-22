package design.visitor.demo1;

//财务部   :计算每周员工工资
public class FADepartment extends Department{

	@Override
	public void visit(FulltimeEmployee fulltimeEmployee) {
		
		int workTime = fulltimeEmployee.getWorkTime();
		double weekWage = fulltimeEmployee.getWeeklyWage();
		
		if (workTime > 40) {
			 weekWage = weekWage +(workTime-40)*100;
		} else if (workTime < 40) {
			weekWage =  weekWage +(workTime-40)*80;
			if(weekWage>0.0){
			}else{
				weekWage=0.0;
			}
		}
		System.out.println(fulltimeEmployee.getName()+"这周工资为: "+weekWage);
		
	}

	@Override
	public void visit(ParttimeEmployee parttimeEmployee) {
		int workTime = parttimeEmployee.getWorkTime();
		double hourWage = parttimeEmployee.getHourWage();  
        System.out.println("临时工" + parttimeEmployee.getName() + "实际工资为：" + workTime * hourWage + "元。");    
	}

}
