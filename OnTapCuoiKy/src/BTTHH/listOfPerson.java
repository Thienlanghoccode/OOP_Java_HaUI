
package BTTHH;

import java.util.ArrayList;
import java.util.Scanner;

public class listOfPerson {
    ArrayList<Person> listOfPerson = new ArrayList<>();
    public void add(Person person){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1.(Students), 2. (Teacher): ");
        int opt = Integer.parseInt(sc.nextLine());
        if(opt == 1){
            person = new Student();
        }
        else if(opt == 2){
            person = new Teacher();
        }
        else {
            System.out.print("Nhap Sai, Nhap Lai!");
        }
        person.nhap();
        listOfPerson.add(person);
    }
    
    public boolean search(Person person){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap ID: ");
        person.id = sc.nextLine();
        for (Person persons : listOfPerson) {
            if(persons.getId().equals(person.getId())){
                persons.printTitle();
                persons.printData();
                return true;
            }
        }
        System.out.println("Khong Tim Thay Nguoi Co ID: " + person.getId());
        return false;
    }
    
    public boolean delete(Person person){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap ID: ");
        person.id = sc.nextLine();
        for (Person persons : listOfPerson) {
            if(persons.getId().equals(person.getId())){
                System.out.println("Da Xoa Thanh Cong !");
                listOfPerson.remove(persons);
                return true;
            }
        }
        System.out.println("Khong The Xoa Vi Khong Ton Tai Nguoi Co ID: " + person.getId());
        return false;
    }
    
    public boolean edit(Person person){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap ID: ");
        person.id = sc.nextLine();
        for (Person persons : listOfPerson) {
            System.out.println("Hay Sua Thong Tin: ");
            persons.nhap();
            return true;
        }
        System.out.println("Khong Tim Thay Nguoi Co ID Tren De Sua !");
        return false;
    }
    
    public void inThongTIn(){
        System.out.println("Danh Sach Hoc Sinh La: ");
        Person.printTitle();
        for (Person persons : listOfPerson) {
            if(persons instanceof Student){
                persons.printData();
            }
        }
        System.out.println();
        System.out.println("Danh Sach Giao Vien La: ");
        Person.printTitle();
        for (Person persons : listOfPerson) {
            if(persons instanceof Teacher){
                persons.printData();
            }
        }
    }
}
