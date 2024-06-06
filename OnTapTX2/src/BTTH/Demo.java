package BTTH;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        listOfCar dsXe = new listOfCar();
        boolean tmp = true;
        Scanner sc = new Scanner(System.in);

        while (tmp) {
            System.out.println("------------- MENU -------------");
            System.out.println("1. Them Xe Vao Danh Sach");
            System.out.println("2. Sua Xe Trong Danh Sach");
            System.out.println("3. Xoa Xe Trong Danh Sach");
            System.out.println("4. Tim O To Theo Ten");
            System.out.println("5. Sap Xep Xe Theo Gia");
            System.out.println("6. In Thong Tin Danh Sach Xe");
            System.out.println("7. Thoat Chuong Trinh !");
            System.out.println();
            System.out.print("Nhap Lua Chon: ");
            int otp = Integer.parseInt(sc.nextLine());
            switch (otp) {
                case 1:
                    Car c = new Car();
                    c.nhap();
                    dsXe.addCar(c);
                    break;
                case 2:
                    Car c1 = new Car();
                    System.out.println("Nhap Xe Can Sua: ");
                    dsXe.editCar(c1);
                    break;
                case 3:
                    Car c2 = new Car();
                    System.out.println("Hay Nhap Xe Can Xoa: ");
                    dsXe.delCar(c2);
                    break;
                case 4:
                    System.out.println("Hay Nhap Ten Can Tim: ");
                    String name = sc.nextLine();
                    dsXe.searchCar(name);
                    break;
                case 5:
                    dsXe.sortedCar();
                    System.out.println("Da Sap Xep Xong !");
                    break;
                case 6:
                    System.out.println("Danh Sach Xe Hien Co: ");
                    dsXe.inThongTin();   
                    break;
                case 7:
                    System.out.println("Da Thoat !");
                    tmp = false;
                    break;
                default:
                    System.out.println("Nhap Sai ! Hay Nhap Lai");
                    break;
            }
        }
    }

}
