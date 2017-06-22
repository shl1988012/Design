package design.Iterator.demo2;

import java.util.List;

public class ProductList<E> extends AbstractObjectList<E>{
	
	public ProductList(List<E> products) {  
        super(products);  
    }  
      
    //实现创建迭代器对象的具体工厂方法  
    public AbstractIterator createIterator() {  
        return new ProductIterator(this);  
    }
}
