package design.Iterator.demo1;

public class ConcreteAggregate implements Aggregate{

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

}
