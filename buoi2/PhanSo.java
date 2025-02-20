package buoi2;

import java.util.Scanner;

public class PhanSo implements Comparable<PhanSo> {
    private int tu, mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void nhap() {       
            System.out.println("Nhap tu so: ");
            Scanner sc = new Scanner(System.in);
            tu = sc.nextInt();
        do {
            System.out.println("Nhap mau so: ");
            mau = sc.nextInt();
        } while (mau == 0);
    }

    public void hienThi() {
        int t = tu / GCD(tu, mau);
        int m = mau / GCD(tu, mau);
        if (m == 1) {
            System.out.println(t);
        } else if (t == 0) {
            System.out.println(0);
        } else if (m < 0) {
            System.out.println((-t) + "/" + (-m));
        } else {
            System.out.println(t + "/" + m);
        }
    }

    public void nghichDao() {
        if (tu == 0) {
            System.out.println("Khong the nghich dao phan so");
        } else {
            int temp = tu;
            tu = mau;
            mau = temp;
        }
    }

    public PhanSo giaTriNghichDao() {
        if (tu == 0) {
            System.out.println("Khong the nghich dao phan so");
            return null;
        } else {
            return new PhanSo(mau, tu);
        }
    }

    public float giaTriThuc() {
        return (float) tu / mau;
    }

    public boolean lonHon(PhanSo a) {
        return tu * a.mau > a.tu * mau;
    }

    public PhanSo cong(PhanSo a) {
        return new PhanSo(tu * a.mau + a.tu * mau, mau * a.mau);
    }

    public PhanSo tru(PhanSo a) {
        return new PhanSo(tu * a.mau - a.tu * mau, mau * a.mau);
    }

    public PhanSo nhan(PhanSo a) {
        return new PhanSo(tu * a.tu, mau * a.mau);
    }

    public PhanSo chia(PhanSo a) {
        return new PhanSo(tu * a.mau, mau * a.tu);
    }

    public PhanSo cong(int a) {
        return new PhanSo(tu + a * mau, mau);
    }

    public PhanSo tru(int a) {
        return new PhanSo(tu - a * mau, mau);
    }

    public PhanSo nhan(int a) {
        return new PhanSo(tu * a, mau);
    }

    public PhanSo chia(int a) {
        return new PhanSo(tu, mau * a);
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    @Override
    public int compareTo(PhanSo o) {
        return Float.compare(giaTriThuc(), o.giaTriThuc());
    }


}
