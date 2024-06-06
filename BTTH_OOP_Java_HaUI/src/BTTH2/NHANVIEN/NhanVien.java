
package BTTH2.NHANVIEN;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NhanVien {
    private String hoDem;
    private String ten;
    LocalDate dob;
    LocalDate ngayVaoLam;

    public NhanVien() {
    }

    public NhanVien(String hoDem, String ten, LocalDate dob, LocalDate ngayVaoLam) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.dob = dob;
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        int ngay; int thang; int nam;
        System.out.print("Hay Nhap Ho Dem Nhan Vien: ");
        this.hoDem = sc.nextLine();
        System.out.print("Hay Nhap Ten Nhan Vien: ");
        this.ten = sc.nextLine();
        System.out.println("Hay Nhap Ngay Sinh Nhan Vien: ");
        System.out.print("Hay Nhap Ngay: ");
        ngay = sc.nextInt();
        System.out.print("Hay Nhap Thang: ");
        thang = sc.nextInt();
        System.out.println("Hay Nhap Nam: ");
        nam = sc.nextInt();
        setDob(LocalDate.of(nam, thang, ngay));
        System.out.println("Hay Nhap Ngay Vao Lam: ");
        System.out.print("Hay Nhap Ngay: ");
        ngay = sc.nextInt();
        System.out.print("Hay Nhap Thang: ");
        thang = sc.nextInt();
        System.out.print("Hay Nhap Nam: ");
        nam = sc.nextInt();
        setNgayVaoLam(LocalDate.of(nam, thang ,ngay));
    }
    
    public static void printTitle(){
        System.out.printf("%10s %10s %15s %15s %n", "HO DEM", 
                "TEN", "NGAY SINH", "NGAY VAO LAM");
    }
    
    public void printData(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dobFormat = this.dob.format(dateTimeFormatter);
        String nvlFormat = this.ngayVaoLam.format(dateTimeFormatter);
        System.out.printf("%10s %10s %15s %15s ", hoDem, 
                ten, dobFormat, nvlFormat);
        System.out.println();
    }
}
