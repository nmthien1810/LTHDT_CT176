package buoi2;

import java.util.Scanner;

public class Date {
    private int day, month, year;

    public Date() {
        day = 0;
        month = 0;
        year = 0;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date d) {
        day = d.day;
        month = d.month;
        year = d.year;
    }

    public void hienThi() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public String toString() {
        return day + "-" + month + "-" + year;
    }

    public void nhap() {        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ngay: ");
            day = sc.nextInt();
            System.out.print("Nhap thang: ");
            month = sc.nextInt();
            System.out.print("Nhap nam: ");
            year = sc.nextInt();
        } while (!hopLe());
    }

    public boolean hopLe() {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[2] = 29;
        }
        if (day < 1 || day > daysInMonth[month] || month < 1 || month > 12 || year < 1) {
            return false;
        }
        return true;
    }

    public Date ngayHomSau() {
        Date d = new Date(day + 1, month, year);
        if (!d.hopLe()) {
            d.day = 1;
            d.month++;
            if (!d.hopLe()) {
                d.month = 1;
                d.year++;
            }
        } 
        return d;
    }

    public Date congNgay(int n) {
        Date d = new Date(day, month, year);
        for (int i = 0; i < n; i++) {
            d = d.ngayHomSau();
        }
        return d;
    }
    
}
