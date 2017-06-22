package design.Observer.demo2;

public class Test {
	
	public static void main(String[] args) {
		
		SubjectFor3d subjectFor3d = new SubjectFor3d();
		SubjectForSSQ subjectForSSQ = new SubjectForSSQ();
		
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		
		observer1.registerSubject(subjectFor3d);
		observer2.registerSubject(subjectForSSQ);
		
		observer1.registerSubject(subjectForSSQ);
		observer2.registerSubject(subjectFor3d);
		
		subjectFor3d.setMsg("subjectFor3d发布消息");
		subjectForSSQ.setMsg("subjectForSSQ发布消息");
	}
	
}
