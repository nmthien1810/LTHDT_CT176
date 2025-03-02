package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
    private String taikhoan, matkhau, email;
    
    public SinhVienCNTT() {
        super();
        taikhoan = new String();
        matkhau = new String();
        email = new String();
    }

    public SinhVienCNTT(SinhVienCNTT s) {
        super(s);
        taikhoan = new String(s.taikhoan);
        matkhau = new String(s.matkhau);
        email = new String(s.email);
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tai khoan: ");
        taikhoan = sc.nextLine();
        
    }
}
