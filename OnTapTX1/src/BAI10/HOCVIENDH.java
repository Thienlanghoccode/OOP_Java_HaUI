
package BAI10;

import java.util.Scanner;


public class HOCVIENDH extends HOCVIEN {
    private int soBuoi;
    private double donGia;
    
    public HOCVIENDH() {
    }

    public HOCVIENDH(int soBuoi, double donGia) {
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }

    public HOCVIENDH(int soBuoi, double donGia, String name, String DiaChi, LOAICT loaict, LOAIUT loaiuutien) {
        super(name, DiaChi, loaict, loaiuutien);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Hoc Phi: " + "\t\t" + tinhHocPhi());
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Hay Nhap So Buoi: ");
        this.soBuoi = sc.nextInt();
        System.out.print("Hay Nhap Don Gia: ");
        this.donGia = sc.nextInt();
    }
    
    

    @Override
    public double tinhHocPhi() {
      if(loaiuutien == LOAIUT.LOAI_1) {
          return soBuoi * donGia - 1000000;
      } else {
          return soBuoi * donGia - 500000;
      }
    }   
}
