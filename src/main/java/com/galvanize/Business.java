package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
	private String name;
	private ArrayList<Address> addresses;

	public Business(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void addAddress(Address address) {
		addresses.add(address);
	}
}
