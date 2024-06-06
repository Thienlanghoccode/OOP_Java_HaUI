
package BTTH2.NHANVIEN;

import java.util.Scanner;

public class DEMO {
     public static void main(String[] args) {
         dsNhanVien DanhSachNV = new dsNhanVien();
        Scanner sc = new Scanner(System.in);
        boolean tmp = true;
        while(tmp){
            System.out.println("------------------MENU------------------");
            System.out.println("1. Nhap Thong Tin Cho Danh Sach Nhan Vien .");
            System.out.println("2. Xuat Thong Tin Nhan Vien .");
            System.out.println("3. Thoat !");
            System.out.println();
            System.out.print("Hay Nhap Lua Chon Cua Ban: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                   DanhSachNV.themNhanVien();
                    System.out.println();
                    break;
                case 2 :
                    DanhSachNV.inDanhSach();
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
