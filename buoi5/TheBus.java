package buoi5;

import java.util.Scanner;

public class TheBus {
    private String maThe, ngayPh;
    private char loaiThe;
    private KhachHang K;

    public TheBus() {
        K = new KhachHang();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap max the:");
        maThe = sc.nextLine();
        System.out.println("Nhap ngay phat hanh (dd/mm/yyyy):");
        ngayPh = sc.nextLine();
        System.out.println("Nhap loai the (H, D, M, Y):");
        loaiThe = sc.nextLine().charAt(0);
        K.nhap();
    }

    public void hienThi() {
        System.out.println(maThe + " - " + ngayPh + " - " + loaiThe + K.toString());
    }
}
