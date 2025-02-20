package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem {
    private String mau;

    public DiemMau() {
        super();
        mau = new String();
    }

    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }
        
    public void ganMau(String mau) {
        this.mau = mau;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau cho diem: ");
        mau = sc.nextLine();
    }

    public void hienThi() {
        super.hienThi();
        System.out.println("Mau cua diem: " + mau);
    }
}
