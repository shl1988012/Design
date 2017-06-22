package design.Iterator.demo3;

import java.util.List;

public class ProductList<E> extends AbstractObjectList<E>{
	
	public ProductList(List<E> products) {  
        super(products);  
    }  
      
    //实现创建迭代器对象的具体工厂方法  
    public AbstractIterator createIterator() {  
        return new ProductIterator();  
    }
    
    
    
    private class ProductIterator<E> implements AbstractIterator{
        private int cursor1; //定义一个游标，用于记录正向遍历的位置  
        private int cursor2; //定义一个游标，用于记录逆向遍历的位置  
        
        public ProductIterator() {  
            cursor1 = 0; //设置正向遍历游标的初始值  
            cursor2 = size() -1; //设置逆向遍历游标的初始值  
        } 
        
        public int size(){
        	return objects.size();
        }
        
    	@Override
    	public void next() {
    		if(cursor1<size()){
    			cursor1++; 
    		}
    	}

    	@Override
    	public boolean isLast() {
    		return (cursor1 == size());  
    	}

    	@Override
    	public void previous() {
    		if(cursor2>-1){
    			cursor2 -- ;
    		}
    	}

    	@Override
    	public boolean isFirst() {
    		 return (cursor2 == -1);  
    	}

    	@Override
    	public Object getNextItem() {
    		return objects.get(cursor1);
    	}

    	@Override
    	public Object getPreviousItem() {
    		return  objects.get(cursor2);
    	}

    }
}
