package buoi4;

public class SDDiemMau {
    public static void main(String[] args) {
        DiemMau A = new DiemMau(5, 10, "trang");
        System.out.println(A);
        DiemMau B = new DiemMau();
        B.nhap();
        B.doiDiem(10, 8);
        B.hienThi();
        B.ganMau("Vang");
        System.out.println(B);
    }
}
