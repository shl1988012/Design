package design.Observer.demo1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

	private List<Observer> observers = new ArrayList<Observer>();  
	 
    private String msg; 

    //信息更新的时候，需要通知所有的观察者
	public void setMsg(String msg) {
		this.msg = msg;
		 notifyObservers(); 
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if(index>=0){
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers){
			o.update(msg);
		}
	}
	

}
