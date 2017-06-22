package design.Memento.demo1;

//备忘录 ，默认可见性，包内可见 
 class Memento {
	private String state;

	public Memento(Originator originator) {

	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
