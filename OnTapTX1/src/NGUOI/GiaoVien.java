package NGUOI;

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoVien extends NhanVienCLC {

    private double thuLaoCV;

    public GiaoVien() {
    }

    public GiaoVien(double thuLaoCV) {
        this.thuLaoCV = thuLaoCV;
    }

    public GiaoVien(double thuLaoCV, String trinhDo, String nganh, String noiDaoTao) {
        super(trinhDo, nganh, noiDaoTao);
        this.thuLaoCV = thuLaoCV;
    }

    public GiaoVien(double thuLaoCV, String trinhDo, String nganh, String noiDaoTao, double salary, LocalDate ngayNhanViec, PhongBanKhoa PBK) {
        super(trinhDo, nganh, noiDaoTao, salary, ngayNhanViec, PBK);
        this.thuLaoCV = thuLaoCV;
    }

    public GiaoVien(double thuLaoCV, String trinhDo, String nganh, String noiDaoTao, double salary, LocalDate ngayNhanViec, PhongBanKhoa PBK, String name, int yearOfBirth) {
        super(trinhDo, nganh, noiDaoTao, salary, ngayNhanViec, PBK, name, yearOfBirth);
        this.thuLaoCV = thuLaoCV;
    }

    public double getThuLaoCV() {
        return thuLaoCV;
    }

    public void setThuLaoCV(double thuLaoCV) {
        this.thuLaoCV = thuLaoCV;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Hay Nhap Thu Lao: ");
        this.thuLaoCV = sc.nextDouble();
    }

    public static void PrintTitle() {
        NhanVienCLC.PrinTitle();
        System.out.printf("%10s", "THU LAO");
        System.out.println();
    }

    public void PrintData() {
        super.PrintData();
        System.out.printf("%10.0f", thuLaoCV);
        System.out.println();
    }

}
