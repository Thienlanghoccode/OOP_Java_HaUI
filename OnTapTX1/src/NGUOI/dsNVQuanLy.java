package NGUOI;

import java.util.ArrayList;
import java.util.Scanner;

public class dsNVQuanLy {

    private ArrayList<NVQuanLy> listNVQL = new ArrayList<>();

    public dsNVQuanLy() {
    }

    public void themNVQuanLy() {
        char c;
        do {
            Scanner sc = new Scanner(System.in);
            NVQuanLy NV1 = new NVQuanLy();
            NV1.input();
            listNVQL.add(NV1);
            System.out.print("Co Nhap Nua Khong (C/K) : ");
            c = sc.next().charAt(0);
        } while (Character.toUpperCase(c) == 'C');
    }

    public void hienThiDs() {
        NVQuanLy.PrintTitle();
        for (NVQuanLy nVQuanLy : listNVQL) {
            nVQuanLy.PrintData();
        }
    }
}
