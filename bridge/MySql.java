package design.bridge;

public class MySql implements DataBase{

	public void getDataSource() {
		System.out.println("获取mysql数据库数据");
	}

}
