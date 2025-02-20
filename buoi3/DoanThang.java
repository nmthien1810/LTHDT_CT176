package buoi3;

import buoi2.Diem;

public class DoanThang {
    private Diem d1, d2;

    public DoanThang() {
        d1 = new Diem();
        d2 = new Diem();
    }

    public DoanThang(Diem A, Diem B) {
        d1 = A;
        d2 = B;
    }

    public DoanThang(int ax, int ay, int bx, int by) {
        d1 = new Diem(ax, ay);
        d2 = new Diem(bx, by);
    }

    public void nhap () {
        d1.nhap();
        d2.nhap();
    }

    public void hienThi() {
        System.out.println("Doan thang co toa do: ");
        d1.hienThi();
        d2.hienThi();
    }

    public void tinhTien(int dx, int dy) {
        d1.doiDiem(dx, dy);
        d2.doiDiem(dx, dy);
    }

    public float doDai() {
        return d1.khoangCach(d2);
    }
}
