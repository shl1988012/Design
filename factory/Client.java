package design.factory;

public class Client {

	public static void main(String[] args) {
		IFactory factory1 = new Factory1();
		IProduct prodect = factory1.createProduct();
		prodect.productMethod();
	}
}
