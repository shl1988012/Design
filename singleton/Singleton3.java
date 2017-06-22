package design.singleton;


//私有静态内部类保证单例
public class Singleton3 {

	
	private static class LazyHolder {
		 private static final Singleton3 INSTANCE = new Singleton3();  
	}
	
	private Singleton3(){}
	
	public static final Singleton3 getInstance(){
		
		return LazyHolder.INSTANCE ;
	}
	
}
