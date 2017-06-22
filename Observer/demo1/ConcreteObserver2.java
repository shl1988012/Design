package design.Observer.demo1;

//具体的观察者
public class ConcreteObserver2 implements Observer {

	private Subject subject;

	public ConcreteObserver2(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(String msg) {
		System.out.println("observer2得到 3D 号码  -->" + msg + ", 我要记下来。");
	}

}
