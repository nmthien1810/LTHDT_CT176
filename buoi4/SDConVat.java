package buoi4;

import java.util.Scanner;

public class SDConVat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong con vat: ");
        int n = sc.nextInt();
        ConVat[] ds = new ConVat[n];
        int choice;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap lua chon (1-Bo, 2-De, 3-Heo): ");
            choice = sc.nextInt();
            if (choice == 1) 
                ds[i] = new Bo();
            else if (choice == 2) 
                ds[i] = new De();
            else
                ds[i] = new Heo();
            ds[i].nhap();
        }

        for (int i = 0; i < n; i++) {
            ds[i].hienThi();
            ds[i].keu();
        }
    }
}
