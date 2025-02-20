package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien implements Comparable<SinhVien> {
    private String mssv, name;
    private Date dob;
    private int soLuongHocPhan;
    private String[] tenHocPhan, diemHocPhan;

    public SinhVien() {
        mssv = new String();
        name = new String();
        dob = new Date();
        soLuongHocPhan = 5;
        tenHocPhan = new String[20];
        diemHocPhan = new String[20];
    }

    public SinhVien(SinhVien s) {
        mssv = new String(s.mssv);
        name = new String(s.name);
        dob = new Date(s.dob);
        soLuongHocPhan = s.soLuongHocPhan;
        tenHocPhan = new String[20];
        diemHocPhan = new String[20];
        for (int i = 0; i < soLuongHocPhan; i++) {
            tenHocPhan[i] = new String(s.tenHocPhan[i]);
            diemHocPhan[i] = new String(s.diemHocPhan[i]);
        }

    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        mssv = sc.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        name = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        dob.nhap();
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hoc phan: ");
        soLuongHocPhan = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soLuongHocPhan; i++) {
            System.out.println("Nhap hoc phan thu " + (i + 1) + ": ");
            tenHocPhan[i] = sc.nextLine();
            System.out.println("Nhap diem hoc phan thu " + (i + 1) + ": ");
            diemHocPhan[i] = sc.nextLine();
        }
    }

    public String toString() {
        String s = mssv + "/ " + name + "/ " + dob.toString();;
            for (int i = 0; i < soLuongHocPhan; i++) {
                s += "/ " + tenHocPhan[i] + " - " + diemHocPhan[i];
            }
        return s;
    }

    public float diemTB() {
        float diemTrungBinh = 0;
        for (int i = 0; i < soLuongHocPhan; i++) {
            if (diemHocPhan[i].equals("A")) {
				diemTrungBinh += 4;
			} else if (diemHocPhan[i].equals("B+")) {
				diemTrungBinh += 3.5;
			} else if (diemHocPhan[i].equals("B")) {
				diemTrungBinh += 3;
			} else if (diemHocPhan[i].equals("C+")) {
				diemTrungBinh += 2.5;
			} else if (diemHocPhan[i].equals("C")) {
				diemTrungBinh += 2;
			} else if (diemHocPhan[i].equals("D+")) {
				diemTrungBinh += 1.5;
			} else if (diemHocPhan[i].equals("D")) {
				diemTrungBinh += 1;
			} else {
				diemTrungBinh += 0;
			}
        }
        return diemTrungBinh / soLuongHocPhan;    
    }

    public void dangKiHocPhan(String hocPhan, String diem) {
        if (soLuongHocPhan < 20) {
            tenHocPhan[soLuongHocPhan] = new String(hocPhan);
            diemHocPhan[soLuongHocPhan] = new String(diem);
            soLuongHocPhan++;
        } else {
            System.out.println("Qua so luong hoc phan cho phep");
        }
    }

    public void xoaHocPhan(String hocPhan) {
        if (soLuongHocPhan > 0) {
            for (int i = 0; i < soLuongHocPhan; i++) {
                if (tenHocPhan[i].equals(hocPhan)) {
                    for (int j = i; j < soLuongHocPhan - 1; j++) {
                        tenHocPhan[j] = tenHocPhan[j + 1];
                        diemHocPhan[j] = diemHocPhan[j + 1];
                    }
                    soLuongHocPhan--;
                    break;
                }
            }
        } else {
            System.out.println("Khong co hoc phan nao de xoa");
        }
    }

    @Override
    public int compareTo(SinhVien o) {
        return name.compareTo(o.name);
    }
}
