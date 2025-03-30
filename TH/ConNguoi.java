package TH;

import java.util.Scanner;

public class ConNguoi {
    private String id, hoTen, ngaySinh;
    private char phai;

    public ConNguoi() {
        id = "12345";
        hoTen = "NVA";
        ngaySinh = "12/2/1990";
        phai = 'M';
    }

    public ConNguoi(ConNguoi A) {
        id = A.id;
        hoTen = A.hoTen;
        ngaySinh = A.ngaySinh;
        phai = A.phai;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        id = sc.nextLine();
        System.out.println("Nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh (dd-mm-yyyy):");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap phai (Nam: M, Nu: F):");
        phai = sc.nextLine().charAt(0);
    }

    public void in() {
        System.out.println(id + "/" + hoTen + "/" + ngaySinh + "/" + phai);
    }

    public String toString() {
        return id + "/" + hoTen + "/" + ngaySinh + "/" + phai;
    }

    public int namSinh(String ngaySinh) {
        int p = ngaySinh.lastIndexOf("-");
        int s = Integer.parseInt(ngaySinh.substring(p + 1));
        return s;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public static void main(String[] args) {
        ConNguoi cn1 = new ConNguoi(), cn2;
        cn1.nhap();
        cn1.in();
        cn2 = cn1;
        cn2.in();
    }
}
