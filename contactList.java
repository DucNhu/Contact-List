package caseStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contactList {
    ArrayList<contact> myContact = new ArrayList<>();
    Scanner Scanner = new Scanner(System.in);

    //    Thêm danh bạ:
    public void addContact() {
        System.out.println("Moi nhap ten moi:\n");
        String addName = Scanner.next();
        System.out.println("Moi nhap so dien thoai moi:\t");
        String addPhone = Scanner.next();
        myContact.add(new contact(addName, addPhone));
    }

    //    Sua danh ba:
    public void updateContact() {
        System.out.println("Nhap vi tri ma ban muon sua:\t(0-n)\n");
        int num = Scanner.nextInt();
        System.out.println("Nhap ten ban muon sua thanh:\n");
        String newName = Scanner.next();
        System.out.println("nhap so ma ban muon sua thanh:\n");
        String newPhone = Scanner.next();
        myContact.set(num, new contact(newName, newPhone));
    }

    //Seach:
    public void searchContact() {
        System.out.println("Nhap ten ban muon tim:\n");
        String searName = Scanner.next();
        for (int i = 0; i < myContact.size(); i++) {
            if(searName.equals(myContact.get(i).getName())) {
                System.out.println(myContact.get(i));
            }
            else {
                System.out.println("Sai roi, danh sach cua ban:\n" + i + ":" + myContact.get(i));
            }
        }
    }

    //    Hiển thị danh bạ
    public void printList() {
        myContact.forEach(n -> System.out.println(n));
    }

    //    remove
    public void removeContact() {
        contact ctnRemove = new contact("Duc", "0977");
        for (int i = 0; i < myContact.size(); i++) {
            if (ctnRemove.getName().equals(myContact.get(i).getName()))
                System.out.println("ok");
            else {
                System.out.println("Sai roi, danh sach cua ban:\n" + i + ":"  + myContact.get(i));
            }
        }
    }
}
