import java.io.IOException;

public class CountString {
    public static void main(String[] args) throws IOException {
        String x="hello world";
        int count=0;
        System.out.println("nhập ký tự cần đếm: ");
        char ch = (char) System.in.read();
        for(int i=1; i< x.length() ;i++){
            if( x.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("số các ký tự "+ch+" là: "+count);
    }
}
