
package BTTH;

import java.util.Scanner;

public abstract class Product {
    protected String id;
    protected String name;
    protected int total;
    protected double price;

    public Product() {
    }

    public Product(String id, String name, int total, double price) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.price = price;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", total=" + total + ", price=" + price + '}';
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap ID: ");
        this.id = sc.nextLine();
        System.out.print("Hay Nhap Ten: ");
        this.name = sc.nextLine();
        System.out.print("Hay Nhap So Luong: ");
        this.total = Integer.parseInt(sc.nextLine());
        System.out.print("Hay Nhap Don Gia: ");
        this.price = Double.parseDouble(sc.nextLine());
    }
    
    public void printTitle(){
        System.out.printf("%15s %15s %15s %15s %n", "ID SAN PHAM", "TEN SAN PHAM",
                "SO LUONG", "DON GIA");
    }
    
    public void printData() {
        System.out.printf("%15s %15s %15d %15.0f ", id, name, total, price);
        System.out.println();
    }
}
