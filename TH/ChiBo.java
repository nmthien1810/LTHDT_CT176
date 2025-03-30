package TH;

import java.util.Scanner;

public class ChiBo {
    private String macb, tencb;
    private int soLuong;

    public ChiBo() {
        macb = "m1";
        tencb = "MMT";
        soLuong = 5;
    }

    public ChiBo(String macb, String tencb, int soLuong) {
        this.macb = macb;
        this.tencb = tencb;
        this.soLuong = soLuong; 
    }

    public ChiBo(ChiBo A) {
        macb = A.macb;
        tencb = A.tencb;
        soLuong = A.soLuong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        macb = sc.nextLine();
        System.out.println("Nhap ten: ");
        tencb = sc.nextLine();
        System.out.println("Nhap so dang vien:");
        soLuong =  sc.nextInt();
    }

    public void in() {
        System.out.println(macb + " - " + tencb + " - " + soLuong);
    }

    public String toString() {
        return macb + " - " + tencb + " - " + soLuong;
    }

    public String getTen() {
        return tencb;
    }

    public static void main(String[] args) {
        ChiBo cb1 = new ChiBo(), cb2;
        cb1.nhap();
        cb1.in();
        cb2 = cb1;
        cb2.nhap();
        cb1.in();
        cb2.in();
    }
}
