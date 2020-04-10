import java.util.Scanner;

public class SumDiagonalSquareMatrix {
    public static void main(String[] args) {
        int a;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("Nhập vào số dòng của mảng: ");
            a = scanner.nextInt();
        } while (a <= 0);
        double[][] ar= new double[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                ar[i][j] = scanner.nextInt();
            }
        }
        double sum=0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
               if (i==j){
                   sum+=ar[i][j];
               }
            }
        }
        System.out.println("tổng đường chéo của ma trận vuông: "+sum);

    }
}
