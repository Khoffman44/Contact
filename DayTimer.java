package com.mycompany.app.daytimer;

import java.util.*;

/***************************************************************************
 * DayTimer.java -Class that implements the Organizer and WhoDoneIt interfaces
 *                and creates and manipulates Contact objects.
 *
 * @author Kris Hoffman

 ***************************************************************************/

public class DayTimer implements Organizer, WhoDoneIt{

    /**
     * List initialization for Contact objects
     */
    private List<Contact> contactData;

    public static void main(String[] args) {

    }

    /**
     * DayTimer method and List initialization
     */
    public DayTimer() {
        contactData = new LinkedList<Contact>();
    }

    /**
     * Add method using email to avoid duplicates
     */
    @Override
    public void add(Contact p) {
        if (findByEmail(p.getEmail()) == null) {
            contactData.add(p);
        }

    }

    /**
     * Remove method using email to avoid removing Contacts of the same last name
     */
    @Override
    public void remove(String email) {
        if (findByEmail(email) != null) {
            contactData.remove(findByEmail(email));
        }
    }

    /**
     * Empty method that clears the organizer
     */
    @Override
    public void empty() {
        contactData.clear();
    }

    /**
     * Find method that returns a contact by last name
     */
    @Override
    public List<Contact> find(String lastName) {
        List<Contact> tempContacts = new LinkedList<Contact>();
        for (Contact temp : contactData) {
            if (temp.getLastName().compareTo(lastName) == 0) {
                tempContacts.add(temp);
            }
        }
        return tempContacts;
    }

    /**
     * Find method that returns a contact by email
     */
    @Override
    public Contact findByEmail(String email) {
        for (Contact temp : contactData) {
            if (temp.getEmail().compareTo(email) == 0) {
                return temp;
            }
        }
        return null;
    }

    /**
     * Returns whole organizer
     */
    @Override
    public List<Contact> getAll() {
        return contactData;
    }

    /**
     * Returns a list sorted by last name
     */
    @Override
    public List<Contact> getSortedListByLastName() {
        List<Contact> tempContacts = getAll();
        tempContacts.sort(Comparator.comparing(Contact::getLastName));
        return tempContacts;

    }

    /**
     * Returns a list sorted by first name
     */
    @Override
    public List<Contact> getSortedListByFirstName() {
        List<Contact> tempContacts = getAll();
        tempContacts.sort(Comparator.comparing(Contact::getFirstName));
        return tempContacts;
    }


    /**
     * Returns author of code
     */
    @Override
    public Contact getAuthor() {
        return findByEmail("khoffman44@gmail.com");
    }

}
