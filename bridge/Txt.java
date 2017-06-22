package design.bridge;

public class Txt extends Data{

	@Override
	public void transForm() {
		
		dataBase.getDataSource();
		System.out.println("转换为txt数据");
	}

}
