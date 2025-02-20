package buoi1;

import java.util.Scanner;

public class Bai_5 {
    static void solve(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if (delta > 0) {
            double root1 = (-(b + Math.sqrt(delta)) / 2*a);
            double root2 = (-(b - Math.sqrt(delta)) / 2*a);
            System.out.println("Phuon trinh co 2 nghiem phan biet: " + root1 + " " + root2);
        } else if (delta == 0) {
            double root = -b / 2*a;
            System.out.println("Phuong trinh co nghiem kep: " + root);
        } else {
            System.out.println("Phuon trinh vo nghiem");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            solve(a, b, c);
        }
    }
}
