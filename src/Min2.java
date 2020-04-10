import java.util.Scanner;

public class Min2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của mảng: ");
        int a = scanner.nextInt();
        int[] ar= new int[a];
        System.out.println("Nhập các phần tử cho mảng1: ");
        for (int i = 0; i < a; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            ar[i] = scanner.nextInt();
        }
        int Min = ar[0];
        for (int i= 0 ;i<a;i++){
            if (Min<ar[i]){
                Min=ar[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: "+Min);
    }
}
