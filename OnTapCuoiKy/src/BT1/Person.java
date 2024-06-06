package BT1;

import java.util.Scanner;

public abstract class Person {

    protected String name;
    protected int age;

    public abstract void getInfo();

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void nhap() throws NameFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten: ");
        String ten = sc.nextLine();
        if(ten.trim().equals("")) {
            throw new NameFormatException();
        }
        else {
            this.name = ten;
        }
        System.out.print("Nhap Tuoi: ");
        this.age = Integer.parseInt(sc.nextLine());
    }
}
