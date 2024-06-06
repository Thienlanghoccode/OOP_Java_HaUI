
package NGUOI;

import java.util.Scanner;

public class PhongBanKhoa {
    private String maPBK;
    private String tenPBK;

    public PhongBanKhoa() {
    }

    public PhongBanKhoa(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }

    public String getMaPBK() {
        return maPBK;
    }

    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }

    public String getTenPBK() {
        return tenPBK;
    }

    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }

    @Override
    public String toString() {
        return  " maPBK = " + maPBK + ", tenPBK = " + tenPBK + ' ';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Ma Phong Ban: ");
        this.maPBK = sc.nextLine();
        System.out.print("Hay Nhap Ten Phong Ban: ");
        this.tenPBK = sc.nextLine();
    }
    
    public static void PrintTitle(){
        System.out.printf("%10s %10s", "MA PHONG", "TEN PHONG");
    }
    public void PrintData(){
        System.out.printf("%10s %10s", maPBK, tenPBK); 
    }
}
