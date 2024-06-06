
package BT1;

import java.util.Scanner;

public class Teacher extends Person{
    private String subject;

    public Teacher(String subject, String name, int age) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void nhap() throws NameFormatException {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap Mon Hoc: ");
        this.subject = sc.nextLine();
    }

    @Override
    public void getInfo() {
        System.out.printf("%15s %10d %10s", name, age, subject);
        System.out.println();
    }
    
    public static void printTitle() {
        System.out.printf("%15s %10s %10s %n", "HO TEN", "TUOI", "MON HOC");
    }
    
}
