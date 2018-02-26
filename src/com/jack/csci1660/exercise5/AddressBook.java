package com.jack.csci1660.exercise5;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by brobst.30 on 2/26/18.
 *
 * Create a second class that represents an address book (a collection of contact information for many people) that includes
 *  methods for adding new contact information and for searching the existing collection for a contacts email address when the name is specified.
 */
public class AddressBook {

    private Map<String, Contact> book;

    public AddressBook() {
        this.book = new HashMap<>();
    }

    public void addContact(String name, String email) {
        Contact nContact = new Contact(name, email);
        book.put(name, nContact);
    }

    public void printAllContacts() {
        for (String key: book.keySet()) {
            Contact current = book.get(key);
            System.out.printf("Name: %s \nEmail: %s\n\n", current.getName(), current.getEmail());
        }
    }

    public String getEmailForName(String name) {
        Contact nContact = book.get(name);
        if (nContact != null) {
            return nContact.getEmail();
        }
        return null;
    }

}
