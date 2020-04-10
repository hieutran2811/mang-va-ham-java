import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int[] A = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        System.out.println("Nhập vị trí số nguyên k: ");
        int index = scanner.nextInt();
        int[] ar= new int[n+1];
        for (i = 0; i <= n; i++) {
            if (i==index){
                ar[i]=k;
            }else{
                if(i>index){
                    ar[i]=A[i-1];
                }else {
                    ar[i]=A[i];
                }
            }
        }

        System.out.println("Mảng sau khi thêm phần tử " + k + " là: ");
        for (i = 0; i <= n; i++) {
            System.out.print(ar[i] + "\t");
        }
    }
}
