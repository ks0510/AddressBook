/*
 * This java program has person class and takes contact information of persons in
 * array list 
 */
package com.addressbook;

import java.util.*;

import java.io.*;

/**
 * 
 * @author Kaif
 *
 */
/*
 * To declare pesron class
 */
class Person {

	class Person {

	/*
	 * To declare characteristics of perosn class
	 */

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private int zip;
	private String phoneNumber;
	private String email;

	/*
	 * To define constructor of person behaviours
	 */

	Person(String firstName, String lastName, String address, String city, int zip, String phoneNumber, String email) {
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

	public String getPhoneNumber() {
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
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);

		int choice;

		/*
		 * Do While loop to give options to user
		 */

		do {
			/*
			 * To print options for action
			 */

			System.out.println("1.ADD CONTACT");
			choice = sc.nextInt();

			/*
			 * Switch case for different options
			 */
			switch (choice) {

			/*
			 * To add new contact for new person
			 */

			case 1:
				System.out.println("Enter First name");
				String firstName = br.readLine();

				System.out.println("Enter Last name");
				String lastName = br.readLine();

				System.out.println("Enter Address");
				String address = br.readLine();

				System.out.println("Enter City");
				String city = br.readLine();

				System.out.println("Enter zip");
				int zip = sc.nextInt();

				System.out.println("Enter Phone Number");
				String phoneNumber = br.readLine();

				System.out.println("Enter Email");
				String email = br.readLine();

				addressBook.add(new Person(firstName, lastName, address, city, zip, phoneNumber, email));

				break;
		        }
		} while (choice != 0);
		System.out.println(addressBook);
	}
}
