package design.visitor.demo1;

//人力资源部
public class HRDepartment extends Department {

	@Override
	public void visit(FulltimeEmployee fulltimeEmployee) {
		int workTime = fulltimeEmployee.getWorkTime();
		System.out.println("正式员工" + fulltimeEmployee.getName() + "实际工作时间为：" + workTime + "小时。");
		if (workTime > 40) {
			System.out.println("正式员工" + fulltimeEmployee.getName() + "加班时间为：" + (workTime - 40) + "小时。");
		} else if (workTime < 40) {
			System.out.println("正式员工" + fulltimeEmployee.getName() + "请假时间为：" + (40 - workTime) + "小时。");
		}

	}

	@Override
	public void visit(ParttimeEmployee parttimeEmployee) {
		int workTime = parttimeEmployee.getWorkTime();
		System.out.println("临时工" + parttimeEmployee.getName() + "实际工作时间为：" + workTime + "小时。");
	}

}
