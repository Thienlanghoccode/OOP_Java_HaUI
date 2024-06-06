
package BTTHH;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listOfPerson dsNguoi = new listOfPerson();
        System.out.print("Nhap N: ");
        int n = Integer.parseInt(sc.nextLine());
        while(n > 0){
            Person person = new Person() {};
            dsNguoi.add(person);
            n--;
        }
        System.out.println("Danh Sach Hien Co: ");
        dsNguoi.inThongTIn();
        System.out.println();
        //sua
        Person p = new Person() {};
        dsNguoi.edit(p);
        System.out.println("Danh Sach Hien Co: ");
        dsNguoi.inThongTIn();
        System.out.println();
        //xoa
        Person p1 = new Person() {};
        dsNguoi.delete(p1);
        System.out.println("Danh Sach Hien Co: ");
        dsNguoi.inThongTIn();
        System.out.println();
        //tim
        Person p2 = new Person() {};
        dsNguoi.search(p2);
        System.out.println();
    }
}
