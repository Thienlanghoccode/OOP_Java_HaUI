
package HOADON;

import java.util.Scanner;

public class HOADON {
    static int soMatHang;
    private String maHoaDon;
    KHACHHANG member;
    HANG dsHang[];
    NGAYTHANG ngayHD;

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public static int getSoMatHang() {
        return soMatHang;
    }

    public static void setSoMatHang(int soMatHang) {
        HOADON.soMatHang = soMatHang;
    }

    public KHACHHANG getMember() {
        return member;
    }

    public void setMember(KHACHHANG member) {
        this.member = member;
    }

    public HANG[] getDsHang() {
        return dsHang;
    }

    public void setDsHang(HANG[] dsHang) {
        this.dsHang = dsHang;
    }

    public NGAYTHANG getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(NGAYTHANG ngayHD) {
        this.ngayHD = ngayHD;
    }
    
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Ma Hoa Don : ");
        String code = sc.nextLine();
        setMaHoaDon(code);
        
        System.out.println("Hay Nhap Thong Tin Khach Hang : ");
        KHACHHANG kh = new KHACHHANG();
        kh.input();
        setMember(kh);
        System.out.println();
        
        System.out.println("Hay Nhap Ngay Nhap Hoa Don : ");
        NGAYTHANG ngay = new NGAYTHANG();
        ngay.input();
        setNgayHD(ngay);
        System.out.println();
        
        System.out.print("Hay Nhap So Mat Hang : ");
        soMatHang = sc.nextInt();
        this.dsHang = new HANG[soMatHang];
        
        for (int i = 0; i < soMatHang; i++) {
            HANG hang = new HANG();
            System.out.println("Hay Nhap Hang Thu " + (i + 1) + ":");
            hang.input();
            this.dsHang[i] = hang;
            sc.nextLine();
        }
    }
    
    public double tinhTongTien(){
        double res = 0;
        for (int i = 0; i < soMatHang; i++) {
            res += this.dsHang[i].getTongTien();
        }
        return res;
    }
    
    public void printTitle(){
        System.out.printf("%47s %n", "HOA DON");
        System.out.printf("%17s", "MA HOA DON: ");
        System.out.print(getMaHoaDon());
        System.out.println();
        System.out.printf("%25s", "MA KHACH HANG: ");
        System.out.print(member.getMaKhachHang());
        System.out.print("\t\t\t\t" +"NGAY THANG: ");
        System.out.print(ngayHD.toString());
        System.out.println();
        System.out.printf("%18s", "HO TEN: ");
        System.out.print(member.getTenKhachHang());
        System.out.print( "\t\t\t\t"+ "DIA CHI: ");
        System.out.print(member.getDiaChi());
        System.out.println();
        System.out.printf("%5s %10s %15s %15s %15s %15s %n", "STT", 
       "Ma Hang", "Ten Hang", "So Luong", "Don Gia", "Tong Tien");
        
    }

    public void printData(){
        for (int i = 0; i < dsHang.length; i++) {
            System.out.printf("%5d %10s %15s %15d %15.2f %15.2f %n", (i + 1),
                    dsHang[i].getMaHang(), dsHang[i].getTenHang(),
                    dsHang[i].getSoLuong(),dsHang[i].getDonGia(),
                    dsHang[i].getTongTien());   
        }
        System.out.println();
        System.out.print("\t\t\t\t\t\t" + "Tong Tien : ");
        System.out.print(tinhTongTien() + "\n");
    }
    
    public void display(){
        printTitle();
        printData();
    }
}
