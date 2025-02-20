package buoi2;

import java.util.Scanner;

public class Diem {
    private int x, y;
    public Diem() {
        x = 0;
        y = 0;
    } 

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri x: ");
        x = sc.nextInt();
        System.out.print("Nhap gia tri y: ");
        y = sc.nextInt();
    }

    public void hienThi() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int giaTriX() {
        return x;
    }

    public int giaTriY() {
        return y;
    }

    public float khoangCach() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public float khoangCach(Diem a) {
        return (float) Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
    }
}
