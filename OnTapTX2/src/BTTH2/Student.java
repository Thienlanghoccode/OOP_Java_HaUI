package KTTX2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Student extends Classroom {

    private String maHocVien;
    private String ten;
    private String diaChi;
    private String dienThoai;

    public Student() {
    }

    static int n;
    static Student[] listOfStudent = new Student[n];

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getTen() {
        String result = this.ten.substring(ten.lastIndexOf(' ') + 1);
        return result;
    }
    
    public String getName(){
        return ten;
    }

    public void genderData() {
        Random rd = new Random();
        String ma = "HV" + String.format("%02d", (rd.nextInt(99) + 1));
        setMaHocVien(ma);
        String[] listOfName = {"Yen Van Than", "Nguyen Van A", "Tran Thi B", "Le Van C"};
        String ten = listOfName[rd.nextInt(4)];
        setTen(ten);
        String diachi = "Nha " + String.format("%02d", (rd.nextInt(99) + 1)) + ", Thanh Xuan, Ha Noi";
        setDiaChi(diachi);
        String sdt = "03" + String.format("%08d", (rd.nextInt(99999999) + 1));
        setDienThoai(sdt);
    }

    public static void printTitle() {
        System.out.printf("%10s %15s %29s %15s %n", "MA HOC VIEN", "TEN DAY DU",
                "DIA CHI", "SDT ZALO");
    }

    public void printData() {
        System.out.printf("%10s %15s %30s %15s %n", maHocVien, ten,
                diaChi, dienThoai);
    }

    public static void display() {
        printTitle();
        for (int i = 0; i < n; i++) {
            listOfStudent[i].printData();
        }
    }

    public static void fakeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So Luong Hoc Vien: ");
        n = sc.nextInt();
        listOfStudent = new Student[n];
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.genderData();
            listOfStudent[i] = student;
        }
    }

    public static void SortbyName() {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTen().compareToIgnoreCase(o2.getTen());
            }
        };
        Arrays.sort(listOfStudent, comparator);
        System.out.println("Danh Sach Hoc Vien Sau Khi Sap Xep: ");
        display();
    }

    public static void searchByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten Hoc Vien Can Tim: ");
        String Name = sc.nextLine();
        for (int i = 0; i < listOfStudent.length; i++) {
            if(listOfStudent[i].getName().equals(Name)){
                System.out.println("Co Thong Tin Hoc Vien: ");
                printTitle();
                listOfStudent[i].printData();
                break;
            }
        }
        System.out.println("Khong Co Thong Tin Ve Hoc Vien: " + Name);
    }
    
}
