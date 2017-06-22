package design.singleton;

import java.lang.reflect.Constructor;


//懒汉式单例 : 在调用取得实例方法的时候才会实例化对象
public class Singleton2 {
	
	private Singleton2(){}
	
	//volatile关键字保证线程安全
	private static volatile Singleton2 singleton2 ;
	
	//两种方法：
	//在方法上加锁，导致每次进入getInstance()方法都要同步，影响性能。
	public static synchronized Singleton2 getInstance(){
		if(singleton2 == null){
			singleton2 = new  Singleton2();
		}
		return singleton2;
	}
	
	//双重检查锁定  ： 确保了只有第一次调用单例的时候才会做同步 ; 避免了每次都同步的性能损耗
	public static Singleton2 getInstance1(){
		if(singleton2 == null){
			synchronized (Singleton2.class) {
				 if (singleton2 == null) {    
					 singleton2 = new Singleton2();   
	               } 
			}
		}
		return singleton2;
	}
	
	public void test(){
		System.out.println("111");
	}
	
	//通过反射获取多个单例
	public static void main(String[] args) {
		try{
			Class c = Class.forName(Singleton2.class.getName());
			Constructor ct = c.getDeclaredConstructor();
			ct.setAccessible(true);
			Singleton2 singleton =(Singleton2) ct.newInstance();
			singleton.test();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
