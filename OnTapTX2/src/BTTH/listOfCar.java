package BTTH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class listOfCar implements CarManager {

    ArrayList<Car> listOfCar = new ArrayList<>();

    @Override
    public boolean addCar(Car c) {
        listOfCar.add(c);
        return true;
    }

    @Override
    public boolean editCar(Car c) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap ID: ");
        c.id = sc.nextLine();
        for (Car car : listOfCar) {
            if (car.getId().equals(c.getId())) {
                System.out.println("Da Tim Thay Xe Can Sua !");
                car.nhap();
                return true;
            }
        }
        System.out.println("Khong Tim Thay Xe Can Sua !");
        return false;
    }

    @Override
    public boolean delCar(Car c) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap ID: ");
        c.id = sc.nextLine();
        for (Car car : listOfCar) {
            if (car.getId().equals(c.getId())) {
                System.out.println("Da Xoa Xe Can Xoa !");
                return this.listOfCar.remove(car);
            }
        }
        System.out.println("Khong Tim Thay Xe Can Xoa");
        return false;
    }

    @Override
    public List<Car> searchCar(String name) {
        for (Car car : listOfCar) {
            if (car.getName().equals(name)) {
                System.out.println("Thong Tin Xe Can Tim La: ");
                car.printTitle();
                car.printData();
                return listOfCar;
            }
        }
        System.out.println("Khong Co Thong Tin Ve Xe Can Tim !");
        return listOfCar;
    }

    @Override
    public List<Car> sortedCar() {
        Comparator comparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(listOfCar, comparator);
        return listOfCar;
    }

    public void inThongTin() {
        Car car = new Car();
        car.printTitle();
        for (Car car1 : listOfCar) {
            car1.printData();
        }
    }
}
