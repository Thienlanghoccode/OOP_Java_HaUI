
package HOADON;

import java.util.Scanner;

public class NGAYTHANG {
    private int ngay;
    private int thang;
    private int nam;

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Ngay : ");
        int day = sc.nextInt();
        setNgay(day);
        System.out.print("Hay Nhap Thang : ");
        int month = sc.nextInt();
        setThang(month);
        System.out.print("Hay Nhap Nam : ");
        int year = sc.nextInt();
        setNam(year);
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam ;
    }
    
}
