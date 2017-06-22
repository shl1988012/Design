package design.visitor.demo2;

public abstract class Award {
	
	public  abstract void visit(Student student);
	
	public  abstract void visit(Teacher teacher);
}
