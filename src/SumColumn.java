import java.util.Scanner;

public class SumColumn {
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
        double[][] ar= new double[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                ar[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập thứ tự của cột muốn tính: ");
        int c = scanner.nextInt();
        double sum=0;
        for (int i=0; i<a; i++){
            sum+=ar[i][c];
        }
        System.out.print("tổng các phần tử của cột "+c+" là: "+sum);
    }
}
