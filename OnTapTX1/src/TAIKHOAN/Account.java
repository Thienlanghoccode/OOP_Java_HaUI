package TAIKHOAN;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    private int id;
    private String email;
    private String userName;
    private String fullName;
    Department department = new Department();
    Position position = new Position();
    LocalDate createDate;
    Group[] groups;

    public Account() {
    }

    public Account(int id, String email, String userName, String fullName, Department department, Position position, LocalDate createDate, Group[] groups) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void nhapThongTinNhanSu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap ID Tai Khoan: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Hay Nhap Email Tai Khoan: ");
        this.email = sc.nextLine();
        System.out.print("Hay Nhap UserName : ");
        this.userName = sc.nextLine();
        System.out.print("Hay Nhap Ho Ten Day Du: ");
        this.fullName = sc.nextLine();
        System.out.println("Hay Nhap Ngay Lap Tai Khoan: ");
        System.out.print("Hay Nhap Ngay: ");
        int ngay = sc.nextInt();
        System.out.print("Hay Nhap Thang: ");
        int thang = sc.nextInt();
        System.out.print("Hay Nhap Nam: ");
        int nam = sc.nextInt();
        setCreateDate(LocalDate.of(nam, thang, ngay));
    }

    public void PhanCongVaoNhom() {
        Scanner sc = new Scanner(System.in);        
        char c;
        ArrayList<Group> dsNhom = new ArrayList<>();
        do {
            Group gr = new Group();
            gr.nhapNhomHoatDong();
            gr.nhapThongTinNhom();
            dsNhom.add(gr);
            System.out.print("Co Nhap Nua Khong (C/K) : ");
            c = sc.next().charAt(0);
        } while (Character.toUpperCase(c) == 'C');
        this.groups = new Group[dsNhom.size()];
        dsNhom.toArray(this.groups);
    }
    
    //ten phong, so phong
    public void nhapThongTinPhongBan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Thong Tin Phong Ban (1 : SALE, 2 : SOFTWARE DEVELOPMENT, "
                + "3 : MARKETING) : ");
        int n = sc.nextInt();
        if (n == 1) {
            this.department.setName("SALE");
        } else if (n == 2) {
            this.department.setName("SOFTWARE DEVELOPMENT");
        } else if (n == 3) {
            this.department.setName("MARKETING");
        } else {
            System.out.println("KHONG HOP LE , NHAP LAI !");
        }
    }
    
    public void nhapPhongBanHoatDong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Phong Nhan Su Hoat Dong: ");
        int sophong = sc.nextInt();
        this.department.setId(sophong);
    }
    
    //vi tri, chuc vu
    public void nhapViTri() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Vi Tri Nhan Su Cong Tac: ");
        int vt = sc.nextInt();
        this.position.setId(vt);
    }
    
    public void nhapThongTinChucVu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Thong Tin Chuc Vu (1 : DEV, 2 : TEST, "
                + "3 : PM) : ");
        int n1 = sc.nextInt();
        if (n1 == 1) {
            this.position.setName(PositionName.DEV);
        } else if (n1 == 2) {
            this.position.setName(PositionName.TEST);
        } else if (n1 == 3) {
            this.position.setName(PositionName.PM);
        } else {
            System.out.println("KHONG HOP LE , NHAP LAI !");
        }
    }
    
    public void hienThi(){
        System.out.printf("%45s %n", "THONG TIN NHAN SU");
        System.out.print("Ma TK: " + getId() + "\t\t");
        System.out.print("Email: " + getEmail() + "\t\t");
        System.out.print("Ten DN: " + getUserName() + "\t\t");
        System.out.print("Ten Hien Thi: " + getFullName() + "\n");
        System.out.print("Thuoc Phong: " + this.department.getId() + "\t\t");
        System.out.print("Ten Phong: " + this.department.getName() + "\t\t");
        System.out.print("Chuc Vu: " + this.position.getName() + "\n");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = this.createDate.format(formatter);
        System.out.print("Ngay Tao Tai Khoan: " + formattedDate);
        System.out.println();
        System.out.print("Phan Cong Vao Nhom: ");
        for(int i = 0; i < this.groups.length; i++){
            System.out.print(groups[i].getId() + " ");
        }
        System.out.println();
        System.out.printf("%5s %15s %15s %n", "STT", "Ten Nhom", "Ngay Tao Nhom");
        for(int i = 0; i < this.groups.length; i++){
            formattedDate = groups[i].getCreateDate().format(formatter);
            System.out.printf("%5d %15s %15s %n", (i + 1), groups[i].getName(), formattedDate);
        }
    }
}
