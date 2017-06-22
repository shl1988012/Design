package design.Observer.demo1;

public class Test {
	
	
	public static void main(String[] args) {
		
		Observer o1,o2;
		ConcreteSubject s = new ConcreteSubject();
		
		o1 = new ConcreteObserver1(s);
		o2 = new ConcreteObserver2(s);
		
		s.setMsg("aaaa");
		s.setMsg("bbbb");
	}
	
}
