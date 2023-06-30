import java.util.Scanner;

public class Fibonacci {
    public static int getFibo(int n) {
        if(n <= 1){
            return n;
        }
        return getFibo(n - 1) + getFibo(n - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(getFibo(num));
        scan.close();
    }
}
