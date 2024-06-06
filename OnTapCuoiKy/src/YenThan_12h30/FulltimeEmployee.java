
package YenThan_12h30;

import java.util.Scanner;

public class FulltimeEmployee extends Employee{

    public FulltimeEmployee() {
    }
    

    public FulltimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    
    @Override
    public int CalculateSalary() {
        return 8 * paymentPerHour;
    }

    @Override
    public String toString() {
        return super.toString() + " Salary: " + CalculateSalary();
    }
    
    public void printTitle() {
        System.out.printf("%15s %10s %10s %n", "HO TEN",
                "LUONG MOT GIO", "LUONG NHAN");
    }
    
    public void printData() {
        System.out.printf("%15s %10d %10d ", name,
                paymentPerHour, CalculateSalary());
        System.out.println();
    }
    
    public void display(){
        printTitle();
        printData();
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Ten: ");
        String name = sc.nextLine();
        try {
            setName(name);
        }
        catch (StringFormatException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e ){
            System.out.println("Nhap Sai, Nhap Lai! ");
        }
        System.out.print("Hay Nhap Luong Mot Gio: ");
        this.paymentPerHour = Integer.parseInt(sc.nextLine());
    }
}
