package caseStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        contactList cL = new contactList();
//        List<contact> vl = new ArrayList<>();
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
                   cL.addContact();
                    break;
                case 1 :
                    cL.updateContact();
                    break;
                case 2 :
                    cL.removeContact();
                    break;
                case 3 :
                    cL.searchContact();
                    break;
                case 4 :
                    cL.printList();
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
