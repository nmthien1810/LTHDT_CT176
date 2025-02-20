package buoi3;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong loai gach: ");
		int n = sc.nextInt();
		Gach[] ds = new Gach[n];
		for (int i = 0; i < n; i++) {
			ds[i] = new Gach();
			ds[i].nhap();
		}
		System.out.println("\nDanh sach cac loai gach vua nhap; ");
		for (int i = 0; i < n; i++) {
			ds[i].hienThi();
		}
		Gach A = ds[0];
		for (int i = 1; i < n; i++) {
			if (ds[i].giaTienChiaDienTich() < A.giaTienChiaDienTich()) {
				A = ds[i];
			}
		}
		System.out.println("\nLoai gach co gia ban thap nhat: ");
		A.hienThi();
		System.out.println("\nSo tien cho tung loai gach khi lot cho 100m^2 la: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Loai gach " + (i + 1) + ": " + ds[i].soLuongHop(1500, 500) * ds[i].layGia());
		}
	}
}
