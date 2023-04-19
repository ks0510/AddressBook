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

		Scanner sc = new Scanner(System.in);

		Scanner s = new Scanner(System.in);

		int choice;

		/*
		 * Do While loop to give options to user
		 */

		do {
			/*
			 * To print options for action
			 */

			System.out.println("1.ADD CONTACT");
			System.out.println("2.UPDATE CONTACT");
			
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
				String firstName = sc.nextLine();

				System.out.println("Enter Last name");
				String lastName = sc.nextLine();

				System.out.println("Enter Address");
				String address = sc.nextLine();

				System.out.println("Enter City");
				String city = sc.nextLine();

				System.out.println("Enter zip");
				int zip = s.nextInt();

				System.out.println("Enter Phone Number");
				double phoneNumber = s.nextDouble();

				System.out.println("Enter Email");
				String email = sc.nextLine();

				addressBook.add(new Person(firstName, lastName, address, city, zip, phoneNumber, email));

				break;
			case 2:

				/*
				 * To update existing information
				 */
				boolean found = false;
				System.out.println("Enter name to update");
				lastName = sc.nextLine();

				ListIterator<Person> li = addressBook.listIterator();
				while (li.hasNext()) {
					Person p = li.next();
					if (p.getFirstName() == lastName) {

						System.out.println("Enter new first name");
						firstName = sc.nextLine();

						System.out.println("Enter new Address");
						address = sc.nextLine();

						System.out.println("Enter new City");
						city = sc.nextLine();

						System.out.println("Enter new zip");
						zip = s.nextInt();

						System.out.println("Enter new Phone Number");
						phoneNumber = s.nextDouble();

						System.out.println("Enter new Email");
						email = sc.nextLine();

						li.set(new Person(firstName, lastName, address, city, zip, phoneNumber, email));
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record updated successfully");
				}
				break;
                         }
		} while (choice != 0);
		System.out.println(addressBook);
	}
}
