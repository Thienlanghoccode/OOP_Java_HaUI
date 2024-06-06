package TAIKHOAN;

import java.util.Scanner;

public class DeMo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tmp = true;
        Account TK = new Account();
        Group gr = new Group();
        while (tmp) {
            System.out.println("---------------MENU---------------");
            System.out.println("1. Nhap Thong Tin Phong Ban .");
            System.out.println("2. Nhap Thong Tin Chuc Vu .");
            System.out.println("3. Nhap Thong Tin Nhom Hoat Dong .");
            System.out.println("4. Nhap Thong Tin Nhan Su .");
            System.out.println("5. Phan Cong Nhan Su Vao Phong Ban .");
            System.out.println("6. Bo Nhiem Vi Tri Cong Tac .");
            System.out.println("7. Nhan Su Tham Gia Nhom Cong Tac .");
            System.out.println("8. Xem Thong Tin Nhan Su .");
            System.out.println("9. Thoat !");
            System.out.println();
            System.out.print("Hay Nhap Lua Chon Cua Ban: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    TK.nhapThongTinPhongBan();
                    System.out.println();
                    break;
                case 2:
                    TK.nhapThongTinChucVu();
                    System.out.println();
                    break;
                case 3:
                    gr.nhapThongTinNhom();
                    System.out.println();
                    break;
                case 4:
                    TK.nhapThongTinNhanSu();
                    break;
                case 5:
                    TK.nhapPhongBanHoatDong();
                    System.out.println();
                    break;
                case 6:
                    TK.nhapViTri();
                    System.out.println();
                    break;
                case 7:
                    TK.PhanCongVaoNhom();
                    break;
                case 8:
                    TK.hienThi();
                    System.out.println();
                    break;
                case 9:
                    System.out.println("DA THOAT CHUONG TRINH !");
                    tmp = false;
                    break;   
                default:
                    System.out.println("Nhap Sai, Hay Nhap Lai");
            }
        }
    }
}
