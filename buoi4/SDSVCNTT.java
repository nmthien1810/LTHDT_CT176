package buoi4;

import java.util.Scanner;

public class SDSVCNTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        SinhVienCNTT[] sv = new SinhVienCNTT[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVienCNTT();
            sv[i].nhapThongTin();
            sv[i].nhapDiem();
        }

        System.out.println("Nhap email de tim tai khoan: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.println("Tai khoan va ket qua cua sinh vien co email " + email + " la: ");
        for (int i = 0; i < n; i++) {
            if (sv[i].getEmail().equals(email)) {
                System.out.println(sv[i].getTaiKhoan());
                System.out.println(sv[i].ketQua());
            }
        }
    }
}
