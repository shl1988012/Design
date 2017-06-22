package design.factory;

public class Factory1 implements IFactory{

	
	@Override
	public IProduct createProduct() {
		return new Product1();
	}

}
