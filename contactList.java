package caseStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contactList {
    ArrayList<contact> myContact = new ArrayList<>();
    Scanner Scanner = new Scanner(System.in);

    //    Thêm danh bạ:
    public ArrayList<contact> addContact(contact contact) {
        myContact.add(contact);
        return myContact;
    }

    //    Sua danh ba:
    public ArrayList<contact> updateContact(contact lastName, contact firstname) {
        for (int i = 0; i < myContact.size(); i++) {
            if (lastName.equals(myContact.get(i))) {
                myContact.set(i, firstname);
            }
        }
        return myContact;
    }

    //Seach:
    public void searchContact(String searName) {
        for (int i = 0; i < myContact.size(); i++) {
            if (searName.equals(myContact.get(i).getName())) {
                System.out.println(myContact.get(i));
            }
        }
    }

    //    Hiển thị danh bạ
    public void printList() {
        myContact.forEach(n -> System.out.println(n));
    }

    //    remove
    public ArrayList<contact> removeContact(contact contact) {
        for (int i = 0; i < myContact.size(); i++) {
            if (contact.getName().equals(myContact.get(i).getName())) {
                myContact.remove(i);
            }
        }
        return myContact;
    }
}