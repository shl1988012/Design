package design.visitor.demo2;

//如果教师发表论文数超过10篇或者学生论文超过2篇可以评选科研奖，
public class ScientificAward extends Award{

	@Override
	public void visit(Student student) {
		int paperCount =student.getPaperCount();
		if(paperCount>2){
			System.out.println(student.getName()+"可以评选科研奖");
		}
	}

	@Override
	public void visit(Teacher teacher) {
		int paperCount =teacher.getPaperCount();
		if(paperCount>10){
			System.out.println(teacher.getName()+"可以评选科研奖");
		}		
	}

}
