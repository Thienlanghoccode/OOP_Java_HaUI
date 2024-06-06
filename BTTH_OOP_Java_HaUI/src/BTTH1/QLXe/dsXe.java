
package QLXe;

import java.util.ArrayList;
import java.util.Scanner;

public class dsXe {
    private ArrayList<Xe> listXe = new ArrayList<Xe>();

    public dsXe() {
    }
    
    public void themXe(){
        char c;
        do{
            Scanner sc = new Scanner(System.in);
            Xe xe = new Xe();
            xe.input();
            listXe.add(xe);
            System.out.print("Co Nhap Nua Khong (C/K) : ");
            c = sc.nextLine().charAt(0);
        } while (Character.toUpperCase(c) == 'C');
    }
    
    public void inDanhSach(){
        Xe.printTitle();
        for (Xe xe : listXe) {
            xe.printData(); 
        }
    }
}
