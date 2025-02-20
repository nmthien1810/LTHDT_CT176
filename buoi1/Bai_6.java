package buoi1;

import java.util.Scanner;

public class Bai_6 {
    public static boolean checkPrime(int x) {
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) 
                return false;
        }
        return x > 1;
    }

    public static void decimalToBinary(int x) {
        if (x == 0 || x == 1) {
            System.out.print(x);
        } else {
            decimalToBinary(x / 2);
            System.out.print(x % 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (checkPrime(x)) {
            System.out.println(x + " la so nguyen to");
        } else {
            System.out.println(x + " khong la so nguyen to");
        }
        decimalToBinary(x);
        sc.close();
    }
}
