package com.jack.csci1660.exercise5;

/*
Create a class that represents contact information for a person. The class should store the person's name and their email address.

Create a second class that represents an address book (a collection of contact information for many people) that includes
methods for adding new contact information and for searching the existing collection for a contacts email address when the name is specified.

The program should create instances of the classes and demonstrate the functionality.
 */

import sun.jvm.hotspot.debugger.Address;

public class Main {

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();

        System.out.println("Created a new Address Book.");
        System.out.println("Adding Contact John, doe@email.com to Address Book");

        ab.addContact("Kenny", "mccormic@southpark.com");

        System.out.println("Address Book now contains:");
        ab.printAllContacts();

        System.out.println("Adding random contacts...");
        ab.addContact("Stan", "marsh@southpark.com");
        ab.addContact("Kyle", "brovlovski@southpark.com");
        ab.addContact("Eric", "cartman@southpark.com");

        System.out.println("Address Book now contains:");
        ab.printAllContacts();

        System.out.println("Searching for Kyle:");
        String kylesEmail = ab.getEmailForName("Kyle");
        System.out.printf("%s, %s", "Kyle", kylesEmail);

    }
}
