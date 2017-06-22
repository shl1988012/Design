package design.visitor.demo2;

//如果教师教学反馈分大于等于90分或者学生平均成绩大于等于90分可以评选成绩优秀奖。
public class LearnAward extends Award{

	@Override
	public void visit(Student student) {
		int score = student.getScore();
		if(score>=90){
			System.out.println(student.getName()+"可以评选成绩优秀奖");
		}
	}

	@Override
	public void visit(Teacher teacher) {
		int score = teacher.getScore();
		if(score>=90){
			System.out.println(teacher.getName()+"可以评选成绩优秀奖");
		}
	}

}
