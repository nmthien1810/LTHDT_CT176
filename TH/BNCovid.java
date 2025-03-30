package TH;

import java.util.Scanner;

public class BNCovid extends BNhan {
    private String ngay, odich, noi;
    private char loai;
    
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay cach li (dd-mm-yyyy):");
        ngay = sc.nextLine();
        System.out.println("Nhap loai nguoi nhiem (F0: 0, F1: 1, F2: 2,...):");
        loai = sc.nextLine().charAt(0);
        System.out.println("Nhap o dich:");
        odich = sc.nextLine();
        System.out.println("Nhap noi cach li:");
        noi = sc.nextLine();
    }

    public void in() {
        super.in();
        System.out.println("/" + ngay + "/" + loai + "/" + odich + "/" + noi);
    }

    public String toString() {
        return super.toString() + "/" + ngay + "/" + loai + "/" + odich + "/" + noi;
    }

    public boolean cachLiDuNgay(String ngay) {
        int d = Integer.parseInt(ngay.substring(0, ngay.indexOf('-')));
        int m = Integer.parseInt(ngay.substring(ngay.indexOf('-') + 1, ngay.lastIndexOf('-')));

        if (m == 5 && d >= 4)
            return false;       
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong banh nhan:");
        int n = sc.nextInt();
        BNCovid[] ds = new BNCovid[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new BNCovid();
            ds[i].nhap();
        }

        System.out.println("Danh sach benh nhan vua nhap:");
        for (int i = 0; i < n; i++) {
            System.out.println(ds[i]);
        }

        System.out.println("Danh sach benh nhan F1 tai Cong ti Hosiden:");
        for (int i = 0; i < n; i++) {
            if (ds[i].odich.equals("Cong ti Hosiden")) {
                if (ds[i].loai == '1') {
                    System.out.println(ds[i]);
                }
            }
        }
        
        System.out.println("Danh sach benh nhan cach li du ngay:");
        for (int i = 0; i < n; i++) {
            if (ds[i].cachLiDuNgay(ds[i].ngay))
                System.out.println(ds[i]);
        }
    }
}
