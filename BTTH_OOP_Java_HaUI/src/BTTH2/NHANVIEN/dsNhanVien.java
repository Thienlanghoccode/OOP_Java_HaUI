
package BTTH2.NHANVIEN;

import java.util.ArrayList;
import java.util.Scanner;

public class dsNhanVien {
    private ArrayList<NhanVien> ListNV = new ArrayList<>();
    
    public void themNhanVien(){
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            NhanVien nv = new NhanVien();
            nv.input();
            ListNV.add(nv);
            System.out.print("Co Nhap Nua Khong (C/K) : ");
            c = sc.nextLine().charAt(0);
        } while(Character.toUpperCase(c) == 'C');
    }
    
    public void inDanhSach() {
        NhanVien.printTitle();
        for (NhanVien nhanVien : ListNV) {
            nhanVien.printData();
        }
    }
}
