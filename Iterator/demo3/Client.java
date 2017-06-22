package design.Iterator.demo3;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<Object> products = new ArrayList<Object>();
		products.add("倚天剑");
		products.add("屠龙刀");
		products.add("断肠草");
		products.add("葵花宝典");
		products.add("四十二章经");
		
		AbstractObjectList<Object> objectList = new ProductList<Object>(products);
		AbstractIterator iterator = objectList.createIterator();
		
		  System.out.println("正向遍历：");    
		  
		  while(!iterator.isLast()){
			  System.out.print(iterator.getNextItem() + "，");  
	            iterator.next();  
		  }
		  System.out.println();  
	        System.out.println("-----------------------------");  
		  System.out.println("逆向遍历：");  
		  
		  while(!iterator.isFirst()){
			  System.out.print(iterator.getPreviousItem() + "，");  
	            iterator.previous();  
		  }
	}
}
