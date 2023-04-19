/*
 * This java program has person class and takes contact information of persons in
 * array list 
 */
package com.addressbook;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */
/*
 * To declare pesron class
 */
class Person {

	/*
	 * To declare characteristics of perosn class
	 */

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private int zip;
	private double phoneNumber;
	private String email;

	/*
	 * To define constructor of person behaviours
	 */

	Person(String firstName, String lastName, String address, String city, int zip, double phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;

	}

	/*
	 * To define get method for all private behavior of person class
	 */

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public int getZip() {
		return zip;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}

}
/*
 * This is main class of this program
 */

public class AddressBook {
	/**
	 * This is starting point of this java program and main function
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * To declare array list for address book
		 */

		ArrayList<Person> addressBook = new ArrayList<Person>();
        }
}

