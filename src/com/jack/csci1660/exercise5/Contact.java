package com.jack.csci1660.exercise5;

/**
 * Created by brobst.30 on 2/26/18.
 *
 * Create a class that represents contact information for a person. The class should store the person's name and their email address.
 */
public class Contact {

    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
}
