package buoi2;

import java.util.Arrays;
import java.util.Scanner;

public class SSPhanSo {
    public static void main(String[] args) {
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        System.out.println("Phan so a: ");
        a.hienThi();
        System.out.println("Phan so b: ");
        b.hienThi();
        PhanSo x = new PhanSo();
        x.nhap();
        System.out.println("Phan so vua nhap: ");
        x.hienThi();
        PhanSo y = new PhanSo();
        y.nhap();
        System.out.println("Phan so vua nhap: ");
        y.hienThi();
        System.out.println("Nghich dao cua x: ");
        x.giaTriNghichDao().hienThi();
        System.out.println("Tong cua x va y: ");
        x.cong(y).hienThi();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan so: ");
        int n = sc.nextInt();
        PhanSo[] ds = new PhanSo[n];
        float sum = 0;
        float max = Float.MIN_VALUE;    
        for (int i = 0; i < n; i++) {
            ds[i] = new PhanSo();
            ds[i].nhap();
            sum += ds[i].giaTriThuc();
            max = Math.max(max, ds[i].giaTriThuc());
        }
        System.out.println("Tong cac phan so: " + sum);
        System.out.println("Phan so co gia tri thuc lon nhat: " + max);

        Arrays.sort(ds);
        // Arrays.sort(ds, (a1, b1) -> Float.compare(a1.giaTriThuc(), b1.giaTriThuc()));
        System.out.println("Danh sach phan so sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            ds[i].hienThi();
        }
    }
}
