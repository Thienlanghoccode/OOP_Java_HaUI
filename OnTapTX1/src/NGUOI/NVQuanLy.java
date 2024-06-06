package NGUOI;

import java.time.LocalDate;
import java.util.Scanner;

public class NVQuanLy extends NhanVienCLC {

    private double phuCapCV;

    public NVQuanLy() {
    }

    public NVQuanLy(double phuCapCV) {
        this.phuCapCV = phuCapCV;
    }

    public NVQuanLy(double phuCapCV, String trinhDo, String nganh, String noiDaoTao) {
        super(trinhDo, nganh, noiDaoTao);
        this.phuCapCV = phuCapCV;
    }

    public NVQuanLy(double phuCapCV, String trinhDo, String nganh, String noiDaoTao, double salary, LocalDate ngayNhanViec, PhongBanKhoa PBK) {
        super(trinhDo, nganh, noiDaoTao, salary, ngayNhanViec, PBK);
        this.phuCapCV = phuCapCV;
    }

    public NVQuanLy(double phuCapCV, String trinhDo, String nganh, String noiDaoTao, double salary, LocalDate ngayNhanViec, PhongBanKhoa PBK, String name, int yearOfBirth) {
        super(trinhDo, nganh, noiDaoTao, salary, ngayNhanViec, PBK, name, yearOfBirth);
        this.phuCapCV = phuCapCV;
    }

    public double getPhuCapCV() {
        return phuCapCV;
    }

    public void setPhuCapCV(double phuCapCV) {
        this.phuCapCV = phuCapCV;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Hay Nhap Phu Cap Cong Viec: ");
        this.phuCapCV = sc.nextDouble();
    }

    public static void PrintTitle() {
        NhanVienCLC.PrinTitle();
        System.out.printf("%10s", "PHU CAP");
        System.out.println();
    }

    public void PrintData() {
        super.PrintData();
        System.out.printf("%10.0f", phuCapCV);
        System.out.println();
    }
}
