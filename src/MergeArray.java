import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng1: ");
            a = scanner.nextInt();
        } while (a <= 0);
        int[] ar1=new int[a];
        System.out.println("Nhập các phần tử cho mảng1: ");
        for (int i = 0; i < a; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            ar1[i] = scanner.nextInt();
        }
        do {
            System.out.println("Nhập vào số phần tử của mảng2: ");
            b = scanner.nextInt();
        } while (b <= 0);
        int[] ar2=new int[b];
        System.out.println("Nhập các phần tử cho mảng2: ");
        for (int i = 0; i < b; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            ar2[i] = scanner.nextInt();
        }
        c=a+b;
        int[] ar3 = new int[c];
        System.arraycopy(ar1, 0, ar3, 0, a);
        System.arraycopy(ar2, 0, ar3, a, b);
        System.out.println("Mảng sau khi gộp là: ");
        for (int i = 0; i <c; i++) {
            System.out.print(ar3[i] + "\t");
        }
    }
}
