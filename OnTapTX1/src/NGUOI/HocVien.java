package NGUOI;

import java.util.Scanner;

public class HocVien extends Nguoi {

    private double gpa;

    public HocVien() {
    }

    public HocVien(double gpa) {
        this.gpa = gpa;
    }

    public HocVien(String name, int yearOfBirth, double gpa) {
        super(name, yearOfBirth);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Hay Nhap Diem: ");
        this.gpa = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", GPA: " + this.gpa;
    }
    
    public static void PrintTitle(){
        Nguoi.PrintTiTile();
        System.out.printf("%10s", "DIEM");
        System.out.println();
    }
    
    public void PrintData(){
        super.PrintData();
        System.out.printf("%10.2f %n", gpa); 
    }
    
}
