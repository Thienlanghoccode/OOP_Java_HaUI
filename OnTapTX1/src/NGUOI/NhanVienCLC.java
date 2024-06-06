
package NGUOI;

import java.time.LocalDate;
import java.util.Scanner;

public class NhanVienCLC extends NhanVien{
    private String trinhDo;
    private String nganh;
    private String noiDaoTao;

    public NhanVienCLC() {
    }

    public NhanVienCLC(String trinhDo, String nganh, String noiDaoTao) {
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    public NhanVienCLC(String trinhDo, String nganh, String noiDaoTao, double salary, LocalDate ngayNhanViec, PhongBanKhoa PBK) {
        super(salary, ngayNhanViec, PBK);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    public NhanVienCLC(String trinhDo, String nganh, String noiDaoTao, double salary, LocalDate ngayNhanViec, PhongBanKhoa PBK, String name, int yearOfBirth) {
        super(salary, ngayNhanViec, PBK, name, yearOfBirth);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNoiDaoTao() {
        return noiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }

    @Override
    public LocalDate getNgayNhanViec() {
        return ngayNhanViec;
    }

    @Override
    public void setNgayNhanViec(LocalDate ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    @Override
    public PhongBanKhoa getPBK() {
        return PBK;
    }

    @Override
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
        System.out.print("Hay Nhap Trinh Do Nhan Vien: ");
        this.trinhDo = sc.nextLine();
        System.out.print("Hay Nhap Nganh Cua Nhan Vien: ");
        this.nganh = sc.nextLine();
        System.out.print("Hay Nhap Noi Dao Tao: ");
        this.noiDaoTao = sc.nextLine();       
    }

    @Override
    public String toString() {
        return super.toString() + " Trinh Do: " + trinhDo + " Nganh: " + nganh + " Noi Dao Tao: " + noiDaoTao;
    }
    
    public static void PrinTitle(){
        NhanVien.PrintTitle();
        System.out.printf("%10s %10s %15s", "TRINH DO", "NGANH", "NOI DAO TAO");
    }
    
    @Override
    public void PrintData(){
        super.PrintData();
        System.out.printf("%10s %10s %15s", trinhDo, nganh, noiDaoTao);
    }
    
}
