package NGUOI;

import java.util.Scanner;
import java.util.jar.Attributes;

public class Nguoi {

    protected String name;
    protected int yearOfBirth;

    public Nguoi() {
    }

    public Nguoi(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return  "Name = " + name + ", Nam Sinh = " + yearOfBirth + ' ';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Ho Ten: ");
        this.name = sc.nextLine();
        System.out.print("Hay Nhap Nam Sinh: ");
        this.yearOfBirth = sc.nextInt();
    }
    
    public static void PrintTiTile(){
        System.out.printf("%12s %10s", "HO TEN", "NAM SINH");
    }
        
    public void PrintData(){
        System.out.printf("%12s %10d",name, yearOfBirth);
    }
    
}
