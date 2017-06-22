package design.bridge;

public abstract class Data {

	protected DataBase dataBase;

	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}
	
	public abstract void transForm();
}
