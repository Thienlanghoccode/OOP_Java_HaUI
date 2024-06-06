package NGUOI;

import java.util.Scanner;

public class DEMO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tmp = true;
        
        dsGiaoVien DanhSachGiaoVien = new dsGiaoVien();
        dsHocVien DanhSachHocVien = new dsHocVien();
        dsNVQuanLy DanhSachQuanLy = new dsNVQuanLy();
        
        
        while (tmp) {
            System.out.println("---------------MENU---------------");
            System.out.println("1. Nhap Danh Sach Hoc Vien .");
            System.out.println("2. Nhap Danh Sach Giao Vien .");
            System.out.println("3. Nhap Danh Sach Quan Ly .");
            System.out.println("4. In Thong Tin Hoc Vien .");
            System.out.println("5. In Thong Tin Giao Vien .");
            System.out.println("6. In Thong Tin Quan Ly .");
            System.out.println("7. Thoat !");
            System.out.println();
            System.out.print("Hay Nhap Lua Chon Cua Ban: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    DanhSachHocVien.themHocVien();
                    System.out.println();
                    break;
                case 2 :
                    DanhSachGiaoVien.themGiaoVien();
                    System.out.println();
                    break;
                case 3 :
                    DanhSachQuanLy.themNVQuanLy();
                    break;
                case 4 :
                    DanhSachHocVien.hienThiDs();
                    System.out.println();
                    break;
                case 5 :
                    DanhSachGiaoVien.hienThiDs();
                    System.out.println();
                    break;
                case 6 :
                    DanhSachQuanLy.hienThiDs();
                    System.out.println();
                    break;
                case 7 :
                    System.out.println("DA THOAT ! ");
                    tmp = false;
                    break;
                default:
                    System.out.println("Nhap Sai, Hay Nhap Lai");
            }
        }
    }
}
