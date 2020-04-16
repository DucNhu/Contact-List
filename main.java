package caseStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        contactList cL = new contactList();
        ArrayList<contact> newArr = new ArrayList<>();

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Starting phone...");
        System.out.println("0 - Thêm danh bạ");
        System.out.println("1 - Sửa danh bạ");
        System.out.println("2 - Xóa danh bạ");
        System.out.println("3 - Tìm danh bạ theo tên");
        System.out.println("4 - Hiển thị danh bạ");
        System.out.println("5 - Out danh bạ");
        int i = 1;
        while (i > 0) {
            System.out.println("Nhập số:\n");
            int num = Scanner.nextInt();

            switch (num) {
                case 0:
                    System.out.println("Moi nhap ten moi:\n");
                    String addName = Scanner.next();
                    System.out.println("Moi nhap so dien thoai moi:\t");
                    String addPhone = Scanner.next();
                    newArr = cL.addContact(new contact(addName, addPhone));
                    break;
                case 1:
                    System.out.println("Nhap ten can sua:\n");
                    String lastName = Scanner.next();
                    for (int y = 0; y < newArr.size(); y++) {
                        if (lastName.equals(newArr.get(y).getName())) {
                            System.out.println("Nhap ten ban muon sua thanh:");
                            String newName = Scanner.next();
                            System.out.println("nhap so ma ban muon sua thanh:");
                            String newPhone = Scanner.next();
                            newArr = cL.updateContact(newArr.get(y), new contact(newName, newPhone));
                        } else {
                            System.out.println("Ten ban nhap khong ton tai!");
                        }
                    }


                    break;
                case 2:
                    System.out.println("Nhap ten can xoa:");
                    String removeName = Scanner.next();
                    for (int y = 0; y < newArr.size(); y++) {
                        if (removeName.equals(newArr.get(i).getName()))
                            newArr = cL.removeContact(newArr.get(i));
                        else {
                            System.out.println("Sai roi, danh sach cua ban:\n" + i + ":" + newArr.get(i));
                        }
                    }
                    break;
                case 3 :
                    System.out.println("Nhap  ten ban muon tim:");
                    String searName = Scanner.next();
                    for (int y = 0; y < newArr.size(); y++) {
                        if (searName.equals(newArr.get(y).getName())) {
                             cL.searchContact(searName);
                        } else {
                            System.out.println("Sai roi, danh sach cua ban:\n" + y + ":" + newArr.get(y));
                        }
                    }
                    break;
                case 4:
                    cL.printList();
                    newArr.forEach(n -> System.out.println(n));
                    break;
                case 5 :
                    System.out.println("END");
                    i = -1;
                    break;
                default:
                    System.out.println("END");
                    i = -1;
            }
        }
    }
}
