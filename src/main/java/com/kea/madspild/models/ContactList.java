package com.kea.madspild.models;

import java.util.ArrayList;

public class ContactList {

    private ArrayList<com.kea.madspild.models.Contact> contacts = new ArrayList<>();
    private static int counter = 0;

    public void add(com.kea.madspild.models.Contact contact) {
        counter++;
        contacts.add(contact);
    }

    public void remove(com.kea.madspild.models.Contact contact) {
        contacts.remove(contact);
    }

    public com.kea.madspild.models.Contact get(int index) {
        return contacts.get(index);

    }
    @Override
    public String toString() {
        return "Contacts{" +
                "contacts=" + contacts +
                '}';
    }

    public ArrayList<com.kea.madspild.models.Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<com.kea.madspild.models.Contact> contacts) {
        this.contacts = contacts;
    }

}
