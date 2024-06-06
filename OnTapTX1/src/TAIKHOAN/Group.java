package TAIKHOAN;

import java.time.LocalDate;
import java.util.Scanner;

public class Group {

    private int id;
    private String name;
    LocalDate createDate;
    Account creator;

    public Group() {
    }

    public Group(int id, String name, LocalDate createDate, Account creator) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public void nhapThongTinNhom() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Thong Tin Nhom (1 : Java Fresher, 2 : DB Fresher, "
                + "3 : C++ Fresher) : ");
        int n = sc.nextInt();
        if (n == 1) {
            setName("Java Fresher");
        } else if (n == 2) {
            setName("DB Fresher");
        } else if (n == 3) {
            setName("C++ Fresher");
        } else {
            System.out.println("KHONG HOP LE , NHAP LAI !");
        }
    }

    public void nhapNhomHoatDong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Nhom Nhan Su Hoat Dong: ");
        this.id = sc.nextInt();
        System.out.println("Hay Nhap Ngay Lap Nhom: ");
        System.out.print("Hay Nhap Ngay: ");
        int ngay = sc.nextInt();
        System.out.print("Hay Nhap Thang: ");
        int thang = sc.nextInt();
        System.out.print("Hay Nhap Nam: ");
        int nam = sc.nextInt();
        setCreateDate(LocalDate.of(nam, thang, ngay));
    }
}
