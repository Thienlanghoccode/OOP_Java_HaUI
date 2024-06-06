
package BAI10;

import java.util.Scanner;

public abstract class HOCVIEN {
    protected String name;
    protected String DiaChi;
    protected LOAICT loaict ;
    protected LOAIUT loaiuutien;

    public HOCVIEN() {
    }

    public HOCVIEN(String name, String DiaChi, LOAICT loaict, LOAIUT loaiuutien) {
        this.name = name;
        this.DiaChi = DiaChi;
        this.loaict = loaict;
        this.loaiuutien = loaiuutien;
    }

    public void setLoaict(LOAICT loaict) {
        this.loaict = loaict;
    }

    public void setLoaiuutien(LOAIUT loaiuutien) {
        this.loaiuutien = loaiuutien;
    }
    
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Ho Ten Hoc Vien: ");
        this.name = sc.nextLine();
        System.out.print("Hay Nhap Dia Chi Hoc Vien: ");
        this.DiaChi = sc.nextLine();
        System.out.print("Hay Nhap Loai Uu Tien (1: Loai 1, 2 : Loai 2): ");
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1) {
            setLoaiuutien(loaiuutien.LOAI_1);
        } else {
            setLoaiuutien(loaiuutien.LOAI_2);
        }
        System.out.print("Hay Nhap Loai Chuong Trinh Dang Ky (1 : Do Hoa, 2 : Lap Trinh): ");
        int c = Integer.parseInt(sc.nextLine());
        if(c == 1) {
            setLoaict(loaict.DO_HOA);
        } else {
            setLoaict(loaict.LAP_TRINH);
        }
    }
    
    public abstract double tinhHocPhi();
    
    public void inThongTin() {
        System.out.println();
        System.out.println("\t\t THONG TIN HOC VIEN");
        System.out.print("Ho Ten: " + "\t\t" + name + "\n");
        System.out.println("Dia Chi: " + "\t\t" + DiaChi);
        System.out.println("Loai Uu Tien: " + "\t\t" + this.loaiuutien);
        System.out.println("Loai Chuong Trinh: \t" + this.loaict);
    }  
}
