
package QLXe;

import java.util.Scanner;

public class DeMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dsXe DanhSachXE = new dsXe();
        boolean tmp = true;
        while(tmp){
            System.out.println("------------------MENU------------------");
            System.out.println("1. Nhap Thong Tin Cho Danh Sach Xe .");
            System.out.println("2. Xuat Bang Ke Khai Thue Cua Cac Xe .");
            System.out.println("3. Thoat !");
            System.out.println();
            System.out.print("Hay Nhap Lua Chon Cua Ban: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                   DanhSachXE.themXe();
                    System.out.println();
                    break;
                case 2 :
                    DanhSachXE.inDanhSach();
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("DA THOAT CHUONG TRINH !");
                    tmp = false;
                    break;
                default:
                    System.out.println("NHAP SAI ! VUI LONG CHON LAI");
                    break;
            }
        }       
    }
}
