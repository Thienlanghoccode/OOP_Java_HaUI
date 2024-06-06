package YenThan_12h30;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {

    static Employee[] dsCongNhan;

    static void inThongTin() {
        System.out.println("Danh Sach Cong Nhan Part - Time: ");
        PartimeEmployee tmp = new PartimeEmployee();
        tmp.printTitle();
        for (int i = 0; i < dsCongNhan.length; i++) {
            Employee employee = dsCongNhan[i];
            if (employee instanceof PartimeEmployee) {
                ((PartimeEmployee) employee).printData();
            }
        }
        System.out.println();
        FulltimeEmployee cn = new FulltimeEmployee();
        System.out.println("Danh Sach Cong Nhan Full - Time: ");
        cn.printTitle();
        for (int i = 0; i < dsCongNhan.length; i++) {
            Employee employee = dsCongNhan[i];
            if (employee instanceof FulltimeEmployee) {
                ((FulltimeEmployee) employee).printData();
            }
        }

    }

    static void fakeData() {
        dsCongNhan = new Employee[10];
        dsCongNhan[0] = new PartimeEmployee(1, "Yen Van Than", 30000);
        dsCongNhan[1] = new PartimeEmployee(2, "Tran Van A", 25000);
        dsCongNhan[2] = new PartimeEmployee(3, "Tran Van B", 35000);
        dsCongNhan[3] = new PartimeEmployee(4, "Tran Van C", 40000);
        dsCongNhan[4] = new PartimeEmployee(5, "Tran Van D", 15000);
        dsCongNhan[5] = new FulltimeEmployee("Nguyen Van A", 100000);
        dsCongNhan[6] = new FulltimeEmployee("Nguyen Van C", 200000);
        dsCongNhan[7] = new FulltimeEmployee("Trinh Van D", 300000);
        dsCongNhan[8] = new FulltimeEmployee("Tran Thi E", 400000);
        dsCongNhan[9] = new FulltimeEmployee("Than Thi B", 500000);

        System.out.println("Danh Sach Cong Nhan Ban Dau: ");
        inThongTin();

        Comparator comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.CalculateSalary() > o2.CalculateSalary()) {
                    return 1;
                } else if (o1.CalculateSalary() < o2.CalculateSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(Arrays.asList(dsCongNhan), comparator);
        System.out.println();
        System.out.println("Danh Sach Cong Nhan Sau Khi Sap Xep");
        inThongTin();
    }

    static void searchName() {
        Scanner sc = new Scanner(System.in);
        String name;
        do {
            try {
                System.out.print("Hay Nhap Ten: ");
                name = sc.nextLine();
                if(name.trim().equals("")) throw new StringFormatException();
                break;
            }
            catch (StringFormatException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e ){
                System.out.println("Nhap Sai, Nhap Lai !");
            }
        } while (true);
        for (int i = 0; i < dsCongNhan.length; i++) {
            if (dsCongNhan[i].getName().equals(name)) {
                System.out.println("Da Tim Thay !");
                if (dsCongNhan[i] instanceof PartimeEmployee) {
                    ((PartimeEmployee) dsCongNhan[i]).nhap();
                } else {
                    ((FulltimeEmployee) dsCongNhan[i]).nhap();
                }
            }
        }
        System.out.println("Danh Sach Sau Khi Sua: ");
        inThongTin();
    }

    public static void main(String[] args) {
        fakeData();
        System.out.println();
        searchName();
    }
}
