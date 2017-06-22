package design.Observer.demo2;

import java.util.Observable;

//主题2
public class SubjectForSSQ extends Observable{

	private String msg;

	public String getMsg() {
		return msg;
	}

	/**
	 * 主题更新消息
	 * 
	 * @param msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
		setChanged();
		notifyObservers();
	}
}
