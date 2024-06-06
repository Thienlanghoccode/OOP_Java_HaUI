package NGUOI;

import java.util.ArrayList;
import java.util.Scanner;

public class dsGiaoVien {

    private ArrayList<GiaoVien> listGV = new ArrayList<>();

    public dsGiaoVien() {
    }

    public void themGiaoVien() {
        char c;
        do {
            Scanner sc = new Scanner(System.in);
            GiaoVien GV = new GiaoVien();
            GV.input();
            listGV.add(GV);
            System.out.print("Co Nhap Nua Khong (C/K) : ");
            c = sc.next().charAt(0);
        } while (Character.toUpperCase(c) == 'C');
    }

    public void hienThiDs() {
        GiaoVien.PrintTitle();
        for (GiaoVien giaoVien : listGV) {
            giaoVien.PrintData();
        }
    }
}
