package buoi2;

public class SSDate {
    public static void main(String[] args) {
        Date d1 = new Date(31, 12, 2024);
        d1.hienThi();
        Date d2 = new Date();
        d2.nhap();
        d2.hienThi();
        System.out.println("Ngay hom sau: ");
        Date d3 = d2.ngayHomSau();
        d3.hienThi();
        System.out.println("Ngay sau khi cong: ");
        d2.congNgay(20).hienThi();
    }
}
