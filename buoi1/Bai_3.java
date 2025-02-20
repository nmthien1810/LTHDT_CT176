package buoi1;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch;
            do {
                ch = sc.nextLine().charAt(0);
                if (ch != 'q') {
                    System.out.println(ch);
                }
            }
            while (ch != 'q');
        }
    }
}
