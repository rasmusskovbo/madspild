package com.kea.madspild.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Contacts {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private static int counter = 0;

    public void add(Contact contact) {
        counter++;
        contacts.add(contact);
    }

    public void remove(Contact contact) {
        contacts.remove(contact);
    }

    public Contact get(int index) {
        return contacts.get(index);

    }
    @Override
    public String toString() {
        return "Contacts{" +
                "contacts=" + contacts +
                '}';
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    // Evt. show/display/print/retrieve/savetofile (permanence)
}
