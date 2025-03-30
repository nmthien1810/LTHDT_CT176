package TH;

import java.util.Scanner;

public class BNhan {
    private String hoTen;
    private boolean gioiTinh;
    private int namSinh;
    private float canNang;

    public BNhan() {
        hoTen = "NVA";
        gioiTinh = true;
        namSinh = 2005;
        canNang = 51.5f;
    }

    public BNhan(BNhan A) {
        hoTen = A.hoTen;
        gioiTinh = A.gioiTinh;
        namSinh = A.namSinh;
        canNang = A.canNang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap gioi tinh (Nam: false, Nu: true):");
        gioiTinh = sc.nextBoolean();
        System.out.println("Nhap nam sinh:");
        namSinh = sc.nextInt();
        System.out.println("Nhap can nang:");
        canNang = sc.nextFloat();
    }

    public void in() {
        System.out.println(hoTen + "/" + gioiTinh + "/" + namSinh + "/" + canNang);
    }

    public String toString() {
        return hoTen + "/" + gioiTinh + "/" + namSinh + "/" + canNang;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BNhan bn1 = new BNhan(), bn2;
        bn1.nhap();
        bn1.in();
        bn2 = bn1;
        bn2.in();
    }
}