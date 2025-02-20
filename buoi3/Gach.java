package buoi3;

import java.util.Scanner;

public class Gach {
	private String maSo, mau;
	private int soVienTrongHop, chieuDai, chieuNgang;
	private long giaBan;
	
	public Gach() {
		maSo = "00001";
		mau = "Trang";
		soVienTrongHop = 10;
		chieuDai = 10;
		chieuNgang = 5;
		giaBan = 150000;
	}

	public Gach(String maSo, String mau, int soVienTrongHop, int chieuDai, int chieuNgang, long giaBan) {
		this.maSo = maSo;
		this.mau = mau;
		this.soVienTrongHop = soVienTrongHop;
		this.chieuDai = chieuDai;
		this.chieuNgang = chieuNgang;
		this.giaBan = giaBan;
	}
	
	public Gach(Gach A) {
		this (A.maSo, A.mau, A.soVienTrongHop, A.chieuDai, A.chieuNgang, A.giaBan);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so: ");
		maSo = sc.nextLine();
		System.out.println("Nhap mau: ");
		mau = sc.nextLine();
		System.out.println("Nhap so luong vien trong 1 hop: ");
		soVienTrongHop = sc.nextInt();
		System.out.println("Nhap chieu dai: ");
		chieuDai = sc.nextInt();
		System.out.println("Nhap chieu rong: ");
		chieuNgang = sc.nextInt();
		System.out.println("Nhap gia ban: ");
		giaBan = sc.nextLong();
	}
	
	public void hienThi() {
		System.out.println(maSo + "/ " + mau + "/ " + soVienTrongHop + "/ " + chieuDai + "/ " + chieuNgang + "/ " + giaBan);
	}
	
	public float giaBanLe() {
		return giaBan / soVienTrongHop * 1.2f;
	}
	
	public long dienTich() {
		return chieuDai * chieuNgang * soVienTrongHop;
	}
	
	public int soLuongHop(int D, int N) {
		int soVienChieuDai = (int) Math.ceil(1.0f * D / chieuDai);
		int soVienChieuNgang = (int) Math.ceil(1.0f * N / chieuNgang);
		return (int) Math.ceil(1.0f * soVienChieuDai * soVienChieuNgang / soVienTrongHop);
	}

	public float giaTienChiaDienTich() {
		return (float) giaBan / dienTich();
	}

	public long layGia() {
		return giaBan;
	}
}





























