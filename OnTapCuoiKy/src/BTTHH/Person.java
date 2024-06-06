package BTTHH;

import java.util.Scanner;

public abstract class Person implements PerSonConTrol{

    protected String id;
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String getId() {
        return id;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap ID: ");
        this.id = sc.nextLine();
        System.out.print("Hay Nhap Ten: ");
        this.name = sc.nextLine();
        System.out.print("Hay Nhap Tuoi: ");
        this.age = Integer.parseInt(sc.nextLine());
    }

    public static void printTitle() {
        System.out.printf("%10s %15s %10s %n", "ID", "TEN", "TUOI");
    }

    public void printData() {
        System.out.printf("%10s %15s %10d ", id, name, age);
        System.out.println();
    }
}
