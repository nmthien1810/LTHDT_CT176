package buoi5;

import java.util.Scanner;

public class KhachHang {
    private String ten, namSinh;
    private boolean gioiTinh;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        ten = sc.nextLine();
        System.out.println("Nhap gioi tinh (0-Nam, 1-Nu):");
        gioiTinh = sc.nextBoolean();
        System.out.println("Nhap nam sinh (dd/mm/yyyy): ");
        sc.nextLine();
        namSinh = sc.nextLine();
    }

    public void hienThi() {
        System.out.println(ten + " - " + gioiTinh + " - " + namSinh);
    }

    public String toString() {
        return ten + " - " + gioiTinh + " - " + namSinh;
    }
}
