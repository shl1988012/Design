package design.bridge;

public class Oracle implements DataBase{

	@Override
	public void getDataSource() {
		System.out.println("获取oracle数据库数据");
	}

}
