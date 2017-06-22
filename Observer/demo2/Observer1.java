package design.Observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer{

	public void registerSubject(Observable observable){
		observable.addObserver(this);
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof SubjectFor3d){
			SubjectFor3d s = (SubjectFor3d)o;
			System.out.println("SubjectFor3d的消息已经更新为："+s.getMsg()+this.getClass().getName());
		}else if(o instanceof SubjectForSSQ){
			SubjectForSSQ s = (SubjectForSSQ)o;
			System.out.println("SubjectForSSQ的消息已经更新为："+s.getMsg()+this.getClass().getName());
		}
		
	}

}
