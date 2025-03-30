package TH;

import java.util.Scanner;

public class CThu extends ConNguoi{
    private int so;
    private String viTri, mua, clb;
    private long soBT;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so ao:");
        so = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vi tri:");
        viTri = sc.nextLine();
        System.out.println("Nhap mua:");
        mua = sc.nextLine();
        System.out.println("Nhap cau lac bo:");
        clb = sc.nextLine();
        System.out.println("Nhap so ban thang:");
        soBT = sc.nextLong();
    }

    public void in() {
        super.in();
        System.out.println(so +"/" + viTri + "/" + mua + "/" + clb + "/" + soBT);
    }

    public String toString() { 
        return super.toString() + "/" + so + "/" + viTri + "/" + mua + "/" + clb + "/" + soBT;
    }

    public long tienLuong() {
        long s = 7000000;
        if (viTri.equals("TM"))
            s += 3000000;
        else if (viTri.equals("HV"))
            s += 4000000;
        else if (viTri.equals("TrV"))
            s += 4500000;
        else if (viTri.equals("TV"))
            s += 5000000;
        else 
            s += 7000000;

        s += soBT * 500000;
        return (long)(s * 0.9);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong cau thu:");
        int n = sc.nextInt();
        CThu[] ds = new CThu[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new CThu();
            ds[i].nhap();
        }
        
        System.out.println("Danh sach cau thu vua nhap:");
        for (int i = 0; i < n; i++) {
            System.out.println(ds[i]);
            System.out.println(ds[i].tienLuong());;
        }

        System.out.println("Danh sach cau thu theo do tuoi:");
        for (int i = 0; i < n; i++) {
            int age = 2025 - ds[i].namSinh(ds[i].getNgaySinh());
            if (18 <= age && age <= 24) 
                System.out.println(ds[i]);
        }
        
    }
}
