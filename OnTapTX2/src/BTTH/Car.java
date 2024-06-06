package BTTH;

import java.util.Scanner;

public class Car extends Product {

    private String hangSanXuat;
    private double khoiLuong;

    public Car() {
    }

    public Car(String hangSanXuat, double khoiLuong, String id, String name, int total, double price) {
        super(id, name, total, price);
        this.hangSanXuat = hangSanXuat;
        this.khoiLuong = khoiLuong;
    }

    @Override
    public String toString() {
        return super.toString() + " Hang San Xuat: " + hangSanXuat + " Khoi Luong: " + khoiLuong;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Hay Nhap Hang San Xuat: ");
        this.hangSanXuat = sc.nextLine();
        System.out.print("Hay Nhap Khoi Luong Xe: ");
        this.khoiLuong = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void printTitle() {
        System.out.printf("%15s %15s %15s %15s %15s %10s %n", "ID SAN PHAM", "TEN SAN PHAM",
                "SO LUONG", "DON GIA", "HANG SAN XUAT", "KHOI LUONG");
    }

    @Override
    public void printData() {
        System.out.printf("%15s %15s %15d %15.0f %15s %10.0f", id, name, total, price,
                hangSanXuat, khoiLuong);
        System.out.println();
    }

    public void display() {
        printTitle();
        printData();
    }
}
