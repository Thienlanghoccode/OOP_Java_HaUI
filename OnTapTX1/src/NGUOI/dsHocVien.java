package NGUOI;

import java.util.ArrayList;
import java.util.Scanner;

public class dsHocVien {

    private ArrayList<HocVien> listHV = new ArrayList<>();

    HocVien HV = new HocVien();

    public dsHocVien() {
    }

    public void themHocVien() {
        char c;
        do {
            Scanner sc = new Scanner(System.in);
            HocVien hocvien = new HocVien();
            hocvien.input();
            listHV.add(hocvien);
            System.out.print("Co Nhap Nua Khong (C/K) : ");
            c = sc.next().charAt(0);
        } while (Character.toUpperCase(c) == 'C');
    }

    public void hienThiDs() {
        HocVien.PrintTitle();
        for (HocVien hocVien : listHV) {
            hocVien.PrintData();
        }
    }
}
