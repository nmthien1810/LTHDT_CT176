package TH;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QGPhatTrien extends QGia {
    private float ttho, dtich;
    private char chluc;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap tuoi tho:");
        ttho = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap chau luc (A: A, W: Au, M: My, U: Uc, P: Phi):");
        chluc = sc.nextLine().charAt(0);
        System.out.println("Nhap dien tich:");
        dtich = sc.nextFloat();
    }

    public void in() {
        System.out.println(super.toString() + "/" + ttho + "/" + chluc + "/" + dtich);
    }
    
    public String toString() {
        return super.toString() + "/" + ttho + "/" + chluc + "/" + dtich;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong:");
        int n = sc.nextInt();
        QGPhatTrien[] ds = new QGPhatTrien[n];

        for (int i = 0; i < n; i++) {
            ds[i] = new QGPhatTrien();
            ds[i].nhap();
        }

        System.out.println("Danh sach quoc gia phat trien:");
        for (int i = 0; i < n; i++) {
            System.out.println(ds[i]);
        }

        System.out.println("Danh sach cac quoc gia phat trien co GDP tren 500 o chau Phi:");
        for (int i = 0; i < n; i++) {
            if (ds[i].chluc == 'P' && ds[i].getGDP() > 500)
                System.out.println(ds[i]); 
        }

        System.out.println("GDP trung binh cua tung chau luc:");

        HashMap<Character, Float> map = new HashMap<>();
        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char key = ds[i].chluc;
            float value = ds[i].getGDP();
            map.merge(key, value, Float::sum);
            count.merge(key, 1, Integer::sum);
        }

        for (Map.Entry<Character, Float> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " ----- " + (entry.getValue() / count.get(entry.getKey())));
        }
        
    }
}
