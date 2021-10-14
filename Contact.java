package com.mycompany.app.daytimer;

import java.util.Objects;

/***************************************************************************
 * Contact.java - Creates the framework for Contact objects
 *
 *
 * @author Kris Hoffman

 ***************************************************************************/


public class Contact {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;


	/**
	 * Default constructor
	 */
	public Contact() {

	}



	/**
	 * Four parameter constructor
	 */
	public Contact(String firstName, String lastName, String email, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Getter and Setter methods
	 */

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Equals method override
	 */

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Contact contact = (Contact) o;
		return firstName.equals(contact.firstName) && lastName.equals(contact.lastName) && email.equals(contact.email) && phoneNumber.equals(contact.phoneNumber);
	}

	/**
	 * hashCode method override
	 */
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, email, phoneNumber);
	}

	/**
	 * toString method override
	 */
	@Override
	public String toString() {
		return "Contact{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				'}';
	}

}
	