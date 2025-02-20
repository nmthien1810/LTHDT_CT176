package buoi1;

import java.util.Scanner;

public class Bai_4 {
    public static int inputInteger(Scanner sc) {

        String s;
        int n;
        while (true) {
            s = sc.nextLine();
            try {
                n = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong");
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = inputInteger(sc);
        int b = inputInteger(sc);
        System.out.println(a + b);
    }
}
