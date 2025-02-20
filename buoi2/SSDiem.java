package buoi2;

public class SSDiem {
    public static void main(String[] args) {
        Diem A = new Diem(3, 4);
        System.out.println("Toa do diem A: ");
        A.hienThi();
        Diem B = new Diem();
        B.nhap();
        System.out.println("Toa do diem B: ");
        B.hienThi();
        Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
        System.out.println("Toa do diem C: ");
        C.hienThi();
        System.out.println("Khoang cach tu B den O: " + B.khoangCach());
        System.out.println("Khoang cach tu A den B: " + A.khoangCach(B));
    }
}
