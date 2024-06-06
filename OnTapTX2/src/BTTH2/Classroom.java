
package KTTX2;

import java.time.LocalDate;
import java.util.Scanner;

public class Classroom {
    protected String maLop;
    protected String maKhoaHoc;
    protected double chiPhi;
    LocalDate ngayTaoLop;
    protected int soLuongHVMax;

    public Classroom() {
    }

    public Classroom(String maLop, String maKhoaHoc, double chiPhi, LocalDate ngayTaoLop, int soLuongHVMax) {
        this.maLop = maLop;
        this.maKhoaHoc = maKhoaHoc;
        this.chiPhi = chiPhi;
        this.ngayTaoLop = ngayTaoLop;
        this.soLuongHVMax = soLuongHVMax;
    }
    
    public double getSumChiPhi(){
        return this.chiPhi * this.soLuongHVMax;
    }

    public void setNgayTaoLop(LocalDate ngayTaoLop) {
        this.ngayTaoLop = ngayTaoLop;
    }
    
}
