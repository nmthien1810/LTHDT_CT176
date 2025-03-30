package TH;

import java.util.Scanner;

public class DCo {
    private String ten, ngay;
    private float dtich;

    public DCo() {
        ten = "V8";
        dtich = 8.0f;
        ngay = "1-1-2020";
    }

    public DCo(DCo A) {
        ten = A.ten;
        ngay = A.ngay;
        dtich = A.dtich;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten  dong co:");
        ten = sc.nextLine();
        System.out.println("Nhap dung tich dong co:");
        dtich = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap ngay san xuat(dd-mm-yyyy):");
        ngay = sc.nextLine();
    }

    public void in() {
        System.out.println(ten + "/" + dtich + "/" + ngay);
    }

    public String toString() {
        return ten + "/" + dtich + "/" + ngay;
    }

    public String getNgay() {
        return ngay;
    }

    public String getTen() {
        return ten;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DCo dc1 = new DCo(), dc2;
        dc1.nhap();
        dc1.in();
        dc2 = dc1;
        dc2.in();
    }
}
