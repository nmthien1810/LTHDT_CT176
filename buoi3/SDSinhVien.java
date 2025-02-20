package buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class SDSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new SinhVien();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ": ");
            ds[i].nhapThongTin();
            ds[i].nhapDiem();
        }
        
        SinhVien max = ds[0];
        for (int i = 1; i < n; i++) {
            if (ds[i].diemTB() > max.diemTB()) {
                max = ds[i];
            }
        }
        System.out.println("\nSinh vien co diem trung binh cao nhat: ");
        System.out.println(max);

        Arrays.sort(ds);
        System.out.println("\nDanh sach sinh vien sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.println(ds[i]);
        }
    }
}
