package TH;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Xe {
    private String so, ten;
    private long gia;
    private char tthai;
    private DCo dc;

    public Xe() {
        dc = new DCo();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bien so xe:");
        so = sc.nextLine();
        System.out.println("Nhap ten chu xe:");
        ten = sc.nextLine();
        System.out.println("Nhap gia xe:");
        gia = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhap trang thai xe (Co: C, Khong: K):");
        tthai = sc.nextLine().charAt(0);
        dc.nhap();
    }

    public void in() {
        System.out.println(so + "/" + ten + "/" + gia + "/" + tthai + "/" + dc.toString());
    }

    public String toString() {
        return so + "/" + ten + "/" + gia + "/" + tthai + "/" + dc;
    }

    public float lePhi() {
        return (float) (gia * 0.1);
    }

    public boolean hopLe(String ngay) {
        int m = Integer.parseInt(ngay.substring(ngay.indexOf('-') + 1, ngay.lastIndexOf('-')));
        int y = Integer.parseInt(ngay.substring(ngay.lastIndexOf('-') + 1));

        if (y > 2000)
            return false;
        else if (y == 2000) {
            if (m >= 10)
                return false;
        }
        
        return true;
    }

    public String getNgaySX() {
        return dc.getNgay();
    }

    public String getTenDC() {
        return dc.getTen();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong xe:");
        int n = sc.nextInt();
        Xe[] ds = new Xe[n];

        for (int i = 0; i < n; i++) {
            ds[i] = new Xe();
            ds[i].nhap();
        }

        System.out.println("Danh sach xe vua nhap va le phi truoc ba:");
        for (int i = 0; i < n; i++) {
            System.out.println(ds[i] + " ------ " + ds[i].lePhi());
        }
        
        System.out.println("Danh sach xe bi thu hoi hoac co gia tri duoi 10M:");
        for (int i = 0; i < n; i++) {
            if (ds[i].tthai == 'K' || ds[i].gia < 10000000) 
                System.out.println(ds[i]);
        }

        System.out.println("Tong le phi truoc ba cho tung loai dong co sx truoc 10/2000:");

        Map<String, Float> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (ds[i].hopLe(ds[i].getNgaySX())) {
                String key = ds[i].getTenDC();
                float value = ds[i].lePhi();
                map.merge(key, value, Float::sum);
            }
        }

        for (Map.Entry<String, Float> entry: map.entrySet()) {
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }
    }

}
