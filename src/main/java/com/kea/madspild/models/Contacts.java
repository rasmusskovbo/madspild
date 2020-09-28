package com.kea.madspild.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Contacts {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public void remove(Contact contact) {
        contacts.remove(contact);
    }

    // Evt. show/display/print/retrieve/savetofile (permanence)
}
