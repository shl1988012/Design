package design.bridge;

public class Client {
	
	
	public static void main(String[] args) {
		
		DataBase dataBase = new MySql();
		Data data = new Txt();
		data.setDataBase(dataBase);
		data.transForm();
	}
}
