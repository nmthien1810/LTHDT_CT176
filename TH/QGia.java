package TH;

import java.util.Scanner;

public class QGia {
    private String msqg, tenqg, tentd;
    private float GDP;

    public QGia() {
        msqg = "12345";
        tenqg = "VN";
        tentd = "HN";
        GDP = 450;
    }

    public QGia(QGia Q) {
        msqg = Q.msqg;
        tenqg = Q.tenqg;
        tentd = Q.tentd;
        GDP = Q.GDP;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so quoc gia:");
        msqg = sc.nextLine();
        System.out.println("Nhap ten quoc gia:");
        tenqg = sc.nextLine();
        System.out.println("Nhap ten thu do cua quoc gia:");
        tentd = sc.nextLine();
        System.out.println("Nhap GDP cua quoc gia:");
        GDP = sc.nextFloat();
    }

    public void in() {
        System.out.println(msqg + "/" + tenqg + "/" + tentd + "/" + GDP);
    }

    public String toString() {
        return msqg + "/" + tenqg + "/" + tentd + "/" + GDP;
    }

    public float getGDP() {
        return GDP;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QGia qg1 = new QGia(), qg2;
        qg1.nhap();
        qg1.in();
        qg2  = qg1;
        qg2.in();
    }
}
