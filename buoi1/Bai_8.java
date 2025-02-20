package buoi1;

import java.util.Scanner;
import java.util.Arrays;

public class Bai_8 {
    public static void input(int[] a) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Nhap vao mang so nguyen: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
    }

    public static void output(int[] a) {
        for(int i: a) {
            System.out.print(i + " ");
        }

    }

    public static int countX(int[] a, int x) {
        int count = 0;
        for (int i: a) {
            if (i == x)
                count++;
        }
        return count;
    }

    public static void sortArr(int[] a) {
        Arrays.sort(a);
    }

    public static int[] insertArr(int[] a, int x) {
        int n = a.length;
        int[] newArr = new int[n + 1];
        int i = 0;

        while (i < n && a[i] < x) {
            newArr[i] = a[i];
            i++;
        }

        newArr[i] = x;

        while (i < n) {
            newArr[i + 1] = a[i];
            i++;
        }

        return newArr;
    }

    public static int[] deleteArr(int[] a, int x) {
        int n = a.length;
        int count = countX(a, x);

        if (count == 0) {
            System.out.println("Phần tử " + x + " không tồn tại trong mảng.");
            return a;
        }

        int[] newArr = new int[n - count];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != x) {
                newArr[j++] = a[i];
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhao so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        input(a);

        System.out.println("Mang vua nhap la: ");
        output(a);

        System.out.println("\nNhap so can dem: ");
        int x = sc.nextInt();
        System.out.println("So lan xuat hien cua " + x + " la: " + countX(a, x));

        sortArr(a);
        System.out.println("Mang sau khi sap xep: ");
        output(a);

        System.out.println("\nNhap so can chen: ");
        int y = sc.nextInt();
        a = insertArr(a, y);
        System.out.println("Mang sau khi chen " + y + " vao la: ");
        output(a);

        System.out.println("\nNhap so can xoa: ");
        int z = sc.nextInt();
        a = deleteArr(a, z);
        System.out.println("Mang sau khi xoa " + z + " la: ");
        output(a);

        sc.close();
    }
}
