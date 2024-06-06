
package HOADON;

import java.util.Scanner;

public class HANG {
    private String maHang;
    private String tenHang;
    private int soLuong;
    private double donGia;

    public HANG(String maHang, String tenHang, int soLuong, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HANG() {
    }
    
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap Ma Hang : ");
        String code = sc.nextLine();
        setMaHang(code);
        
        System.out.println("Hay Nhap Ten Hang : ");
        String name = sc.nextLine();
        setTenHang(name);
        
        System.out.println("Hay Nhap So Luong : ");
        int number = sc.nextInt();
        setSoLuong(number);
        
        System.out.println("Hay Nhap Don Gia : ");
        double price = sc.nextDouble();
        setDonGia(price);
    }
    
    public double getTongTien(){
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return "HANG{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
    
}
