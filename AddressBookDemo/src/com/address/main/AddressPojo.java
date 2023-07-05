package com.address.main;

public class AddressPojo {
	String name, streetAddress, city, state, ZIPcode;

	public AddressPojo(String name, String streetAddress, String city, String state, String zIPcode) {
		super();
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		ZIPcode = zIPcode;
	}

	public AddressPojo() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZIPcode() {
		return ZIPcode;
	}

	public void setZIPcode(String zIPcode) {
		ZIPcode = zIPcode;
	}
	
}
