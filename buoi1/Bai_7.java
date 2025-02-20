package buoi1;

import java.util.Scanner;

public class Bai_7 {
   public static String splitName(String str) {
      String s = str.trim();
      int p = s.lastIndexOf(" ");
      s = s.substring(p + 1);
      return s;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhap vao ho va ten: ");
      String myName = sc.nextLine();
      System.out.println("Ten vua nhap la: " + splitName(myName));
      sc.close();
   }
}
