
package QLXe;

import java.util.Scanner;

public class Xe {
    private String chuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public Xe() {
    }

    public Xe(String chuXe, String loaiXe, int dungTich, double triGia) {
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
    
    public double getThue(int dungTich, double triGia){
        if(dungTich < 100){
            return triGia * 1 / 100;
        }
        else if(dungTich >= 100 && dungTich <= 200){
            return triGia * 3 / 100;
        }
        else{
            return triGia * 5 / 100;
        }        
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Ten Chu Xe: ");
        this.chuXe = sc.nextLine();
        System.out.print("Hay Nhap Loai Xe: ");
        this.loaiXe = sc.nextLine();
        System.out.print("Hay Nhap Dung Tich: ");
        this.dungTich = sc.nextInt();
        System.out.print("Hay Nhap Tri Gia: ");
        this.triGia = sc.nextDouble();
        sc.nextLine();
    }
    
    public static void printTitle(){
        System.out.printf("%15s %15s %10s %15s %20s %n", "Ten Chu Xe",
                "Loai Xe", "Dung Tich", "Tri Gia", "Thue Phai Nop");     
    }
    
    public void printData(){
        System.out.printf("%15s %15s %10d %15.2f %20.2f", chuXe,
                loaiXe, dungTich, triGia, getThue(dungTich, triGia));
        System.out.println();
    }
}
