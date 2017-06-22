package design.Prototype;

//浅克隆
public class Customer implements Cloneable{

	private Address address ;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Customer clone() {
		Object obj = null;
		try{
			obj = super.clone();
			return (Customer)obj;
		}catch(CloneNotSupportedException e){
			System.out.println("复制失败！ ");
			return null;
		}
	}
}
