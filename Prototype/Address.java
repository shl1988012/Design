package design.Prototype;

import java.io.Serializable;

public class Address implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7658639932379006818L;
	private String address ;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
