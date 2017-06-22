package design.visitor.demo1;

import java.util.ArrayList;

//员工列表类：对象结构
public class EmployeeList {
	
	//定义一个集合用于存储员工对象  
    private ArrayList<Employee> list = new ArrayList<Employee>();  
  
    public void addEmployee(Employee employee)  
    {  
        list.add(employee);  
    }  
  
    //遍历访问员工集合中的每一个员工对象  
    public void accept(Department handler)  
    {  
        for(Employee obj : list)  
        {  
        //为何在 数据集合中 不直接调用 mVistor.visit(mElement),而要使用mElement.accept(mVIstor) 来分派？？	
//(1) 因为在accept()方法中可能还需要调用具体元素类的其他业务方法，而不仅仅是visit()方法。
// (2) 如果具体元素是容器对象，在容器的accept()中可以递归调用成员的accept()，而不需要逐一调用每一个元素的accept()。	
//我看到另外一种说法，是通过这种实现双分派，把方法重载调用的静态分派转化为继承重写的动态分派，这样可以避免静态分派导致的逻辑bug，这个也有着一定道理。 
//直接调用时用的是基类，那么visit里面的重载就废掉了。
       
        	obj.accept(handler); 
  
        	
//        	if(obj instanceof FulltimeEmployee){
//        		handler.visit((FulltimeEmployee)obj);
//        	}else{
//        		handler.visit((ParttimeEmployee)obj);
//        	}
        }  
        
     
    }  
}
