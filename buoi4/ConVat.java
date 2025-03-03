package buoi4;

import java.util.Scanner;

public abstract class ConVat {
    private String giong, mauLong;
    private float canNang;

    public void nhap() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap giong: ");
        giong = sc.nextLine();
        System.out.println("Nhap mau long: ");
        mauLong = sc.nextLine();
        System.out.println("Nhap can nang: ");
        canNang = sc.nextFloat();
    }

    public void hienThi() {
        System.out.println(giong + "/" + mauLong + "/" + canNang);
    }

    public abstract void keu();
}

class Bo extends ConVat {
    public void keu() {
        System.out.println("Bo keu: Boooooo");
    }
}

class De extends ConVat {
    public void keu() {
        System.out.println("De keu: Beeeeee");
    }
}

class Heo extends ConVat {
    public void keu() {
        System.out.println("Heo keu: Oink oink");
    }
}
