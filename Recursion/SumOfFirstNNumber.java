import java.util.Scanner;

public class SumOfFirstNNumber {
    public static void findingSum(int num, int sum){
        if(num < 1){
            System.out.println(sum);
            return;
        }
        findingSum(num - 1, sum + num);
    }
    public static int findingSumWithOutParameter(int num){
        if(num < 1){
            return 0;
        }
        return num + findingSumWithOutParameter(num - 1);
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        findingSum(input, 0);
        System.out.println(findingSumWithOutParameter(input));
        scan.close();
    }
}
