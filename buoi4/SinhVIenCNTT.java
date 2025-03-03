package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
    private String taikhoan, matkhau, email;
    
    public SinhVienCNTT() {
        super();
        taikhoan = "abc";
        matkhau = "abc";
        email = "abc";
    }

    public SinhVienCNTT(SinhVienCNTT s) {
        super(s);
        taikhoan = s.taikhoan;
        matkhau = s.matkhau;
        email = s.email;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tai khoan: ");
        taikhoan = sc.nextLine();
        System.out.println("Nhap mat khau: ");
        matkhau = sc.nextLine();
        System.out.println("Nhap email: ");
        email = sc.nextLine();
    }

    public String toString(String taikhoan, String matkhau, String email) {
        return super.toString() + "/ " + taikhoan + "/ " + matkhau + "/ " + email;
    }

    public void doiMatKhau(String newpass) {
        this.matkhau = newpass;
    }

    public String getTaiKhoan() {
        return taikhoan;
    }

    public String getEmail() {
        return email;
    }
}
