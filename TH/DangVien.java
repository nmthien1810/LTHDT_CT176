package TH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DangVien {
    private String soThe, hoTen, ngaySinh;
    private float heSo;
    private ChiBo cb;

    public DangVien() {
        cb = new ChiBo();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so the:");
        soThe = sc.nextLine();
        System.out.println("Nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh (dd/mm/yyyy):");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap he so: ");
        heSo = sc.nextFloat();
        cb.nhap();
    }

    public void in() {
        System.out.println(soThe + " - " + hoTen + " - " + ngaySinh + " - " + heSo + " - " + cb.toString());
    }

    public String toString() {
        return soThe + " - " + hoTen + " - " + ngaySinh + " - " + heSo + " - " + cb;
    }

    public String getTenCB() {
        return cb.getTen();
    }

    public int namSinh(String ngaySinh) {
        int p = ngaySinh.lastIndexOf("/");
        int s = Integer.parseInt(ngaySinh.substring(p + 1));
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong dang vien:");
        int n = sc.nextInt();
        DangVien[] ds = new DangVien[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new DangVien();
            ds[i].nhap();
        }

        System.out.println("Danh sach dang vien vua nhap:");
        for (int i = 0; i < n; i++) {
            System.out.println(ds[i]);
        }

        System.out.println("Danh sach dang vien sinh sau nam 1975:");
        for (int i = 0; i< n; i++) {
            if (ds[i].namSinh(ds[i].ngaySinh) > 1975) {
                System.out.println(ds[i].hoTen);
            }
        }

        System.out.println("Danh sach dang vien thuoc MMT va co he so tren 4.32:");
        for (int i = 0; i< n; i++) {
            if (ds[i].getTenCB().equals("MMT") && ds[i].heSo >= 4.32) {
                System.out.println(ds[i].hoTen);
            }
        }

        System.out.println("Danh sach dang vien theo nam sinh:");
        Map<Integer, ArrayList<DangVien>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = ds[i].namSinh(ds[i].ngaySinh);
            map.computeIfAbsent(key, k -> new ArrayList<DangVien>()).add(ds[i]);
        }

        for (Map.Entry<Integer, ArrayList<DangVien>> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            for (DangVien dv: entry.getValue()) {
                System.out.println(dv);
            }
        }
    }
}
