import java.util.Scanner;

public class MaxOfTwoDimensionalArray {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("Nhập vào số dòng của mảng: ");
            a = scanner.nextInt();
        } while (a <= 0);
        do {
            System.out.println("Nhập vào số cột của mảng: ");
            b = scanner.nextInt();
        } while (b <= 0);
        int[][] ar= new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                ar[i][j] = scanner.nextInt();
            }
        }
        int Max= ar[0][0];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (ar[i][j]>Max){
                    Max=ar[i][j];
                }
            }
        }
        System.out.print("Phần tử lớn nhất trong mảng: "+Max);

    }
}
