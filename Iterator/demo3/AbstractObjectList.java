package design.Iterator.demo3;

import java.util.ArrayList;
import java.util.List;


//抽象聚合类 
public abstract  class AbstractObjectList<E> {
	protected List<E> objects = new ArrayList<E>();  
	  
    public AbstractObjectList(List<E> objects) {  
        this.objects = objects;  
    }  
      
    public void addObject(E obj) {  
        this.objects.add(obj);  
    }  
      
    public void removeObject(E obj) {  
        this.objects.remove(obj);  
    }  
      
    public List<E> getObjects() {  
        return this.objects;  
    }  
      
    //声明创建迭代器对象的抽象工厂方法  
    public abstract AbstractIterator createIterator();  
}
