
package HOADON;

import java.util.Scanner;

public class KHACHHANG {
    private String maKhachHang;
    private String diaChi;
    private String tenKhachHang;
    
    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Ma Khach Hang : ");
        String code = sc.nextLine();
        setMaKhachHang(code);
        
        System.out.print("Hay Nhap Ten Khach Hang : ");
        String name = sc.nextLine();
        setTenKhachHang(name);
        
        System.out.print("Hay Nhap Dia Chi Khach Hang : ");
        String address = sc.nextLine();
        setDiaChi(address);
    }

    @Override
    public String toString() {
        return "KHACHHANG{" + "maKhachHang=" + maKhachHang + ", diaChi=" + diaChi + ", tenKhachHang=" + tenKhachHang + '}';
    }
    
}
