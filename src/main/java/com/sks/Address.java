package com.sks;

public class Address {

	private String postCode;
    private String Street;
    private String houseNo;
    private String city;
    
    public Address() {
		super();
	}

	
    
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String postCode, String houseNo, String city) {
		super();
		this.postCode = postCode;
		this.houseNo = houseNo;
		this.city = city;
	}
    
    
	
}
