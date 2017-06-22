package design.Prototype;

public class Client {

	
	public static void main(String[] args) throws Exception{
		
		Customer c1 = new Customer();
		Address add = new Address();
		add.setAddress("1111");
		c1.setAddress(add);
		Customer c2 = c1.clone();
		
		System.out.println(c1 == c2);	//false  
		System.out.println(c1.getAddress() == c2.getAddress());//true 地址是同一个对象，表明没有复制一份新的  浅克隆
		
		
		
		Customer2 c3 = new Customer2();
		c3.setAddress(add);
		Customer2 c4 = c3.deepClone();
		System.out.println(c3 == c4);	//false  
		System.out.println(c3.getAddress() == c4.getAddress());//false   深克隆
	}
	
}
