package design.singleton;


//饿汉式单例 ：饿汉式单例在单例类被加载时候，就实例化一个对象交给自己的引用
//饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
public class Singleton1 {

	private static Singleton1 singleton = new Singleton1();
	
	private Singleton1(){}
	
	public static Singleton1 getInstance(){
		
		return singleton;
	}
	
}
