
package NGUOI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NhanVien extends Nguoi{
    private double salary;
    LocalDate ngayNhanViec;
    PhongBanKhoa PBK = new PhongBanKhoa();

    public NhanVien() {
    }

    public NhanVien(double salary, LocalDate ngayNhanViec, PhongBanKhoa PBK) {
        this.salary = salary;
        this.ngayNhanViec = ngayNhanViec;
        this.PBK = PBK;
    }

    public NhanVien(double salary, LocalDate ngayNhanViec, PhongBanKhoa PBK, String name, int yearOfBirth) {
        super(name, yearOfBirth);
        this.salary = salary;
        this.ngayNhanViec = ngayNhanViec;
        this.PBK = PBK;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(LocalDate ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PhongBanKhoa getPBK() {
        return PBK;
    }

    public void setPBK(PhongBanKhoa PBK) {
        this.PBK = PBK;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Hay Nhap Luong: ");
        this.salary = sc.nextDouble();
        System.out.println("Hay Nhap Ngay Nhan Viec: ");
        System.out.print("Hay Nhap Ngay: ");
        int ngay = sc.nextInt();
        System.out.print("Hay Nhap Thang: ");
        int thang = sc.nextInt();
        System.out.print("Hay Nhap Nam: ");
        int nam = sc.nextInt();
        setNgayNhanViec(LocalDate.of(nam, thang, ngay));
        this.PBK.input();
    }

    @Override
    public String toString() {
        return super.toString() + ", Luong: " + this.salary + " Ngay Nhan Viec: " 
                + this.ngayNhanViec + " Phong Ban: " + this.PBK.toString();
    }
    
    public static void PrintTitle(){
        Nguoi.PrintTiTile();
        System.out.printf("%10s %15s ", "LUONG", "NGAY NHAN VIEC");
        PhongBanKhoa.PrintTitle();
    }
    
    @Override
    public void PrintData(){
        super.PrintData();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String FomatDate = this.ngayNhanViec.format(formatter);
        System.out.printf("%10.0f %15s", salary, FomatDate);
        PBK.PrintData();
    }
    
}
    