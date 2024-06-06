
package BT1;

import java.util.Scanner;

public class Employee extends Person{
    private String department;

    public String getDepartment() {
        return department;
    }

    public Employee(String department, String name, int age) {
        super(name, age);
        this.department = department;
    }
    
    @Override
    public void nhap() throws NameFormatException {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap Phong Ban: ");
        this.department = sc.nextLine();
    }
    
    @Override
    public void getInfo() {
        System.out.printf("%15s %10d %10s", name, age, department);
        System.out.println();
    }
    
    public static void printTitle() {
        System.out.printf("%15s %10s %10s %n", "HO TEN", "TUOI", "PHONG BAN");
    }
}
