package BT1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {

    static Person[] dsNguoi;

    static void inThongTin() {
        System.out.println("DANH SACH GIAO VIEN: ");
        Teacher.printTitle();
        for (Person person : dsNguoi) {
            if (person instanceof Teacher) {
                person.getInfo();
            }
        }
        System.out.println();
        System.out.println("DANH SACH NHAN VIEN: ");
        Employee.printTitle();
        for (Person person : dsNguoi) {
            if (person instanceof Employee) {
                person.getInfo();
            }
        }
    }

    static void fakeData() {
        dsNguoi = new Person[5];
        dsNguoi[0] = new Teacher("HOA HOC", "YEN VAN THAN", 30);
        dsNguoi[1] = new Teacher("TOAN HOC", "NGUYEN VAN A", 25);
        dsNguoi[2] = new Teacher("VAN HOC", "TRAN THI B", 26);
        dsNguoi[3] = new Employee("KE TOAN", "LE THI C", 31);
        dsNguoi[4] = new Employee("NHAN SU", "BUI VAN D", 27);

        System.out.println("Danh Sach Nhan Vien Ban Dau La: ");
        inThongTin();
        System.out.println();
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (o1.getName().compareToIgnoreCase(o2.getName()));
            }
        };
        Collections.sort(Arrays.asList(dsNguoi), comparator);
        System.out.println("Danh Sach Nhan Vien Sau Khi Sap Xep: ");
        inThongTin();
    }

    static void search() {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        System.out.print("Hay Nhap Phong Ban: ");
        String phong = sc.nextLine();
        for (Person person : dsNguoi) {
            if (person instanceof Employee) {
                if (((Employee) person).getDepartment().equalsIgnoreCase(phong)) {
                    System.out.println("THONG TIN TIM DUOC: ");
                    Employee.printTitle();
                    ((Employee) person).getInfo();
                    System.out.println("HAY SUA THONG TIN: ");
                    do {
                        try {
                            ((Employee) person).nhap();
                            break;
                        } catch (NameFormatException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (true);
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println("KHONG CO THONG TIN !");
            inThongTin();
        } else {
            Comparator<Person> comparator = new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return (o1.getName().compareToIgnoreCase(o2.getName()));
                }
            };
            Collections.sort(Arrays.asList(dsNguoi), comparator);
            System.out.println("Danh Sach Nhan Vien Sau Khi Sap Xep: ");
            inThongTin();
        }
    }

    public static void main(String[] args) {
        fakeData();
        search();
    }

}
