
package SINHVIEN;

public class SinhVien extends Nguoi{
    private String lop;
    private String nganh;
    Truong truong;

    public SinhVien() {
    }

    public SinhVien(String lop, String nganh, Truong truong) {
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public SinhVien(String name, int age, char gender, String lop, String nganh, Truong truong) {
        super(name, age, gender);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SinhVien{");
        sb.append("lop=").append(lop);
        sb.append(", nganh=").append(nganh);
        sb.append(", truong=").append(truong);
        sb.append('}');
        return sb.toString();
    }
    
}
