package design.bridge;

public class Pdf extends Data{

	@Override
	public void transForm() {
		dataBase.getDataSource();
		System.out.println("转换为pdf数据");		
	}

}
