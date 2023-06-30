import java.util.Scanner;

public class Pallindrom {
    public static boolean check(String str, int l, int r){
        return str.charAt(l) == str.charAt(r) ? true : false;
    }
    public static boolean checkPallindrome(String str, int pos){
        if(pos >= str.length() / 2){
            return true;
        }
        if(!check(str, pos, str.length() - pos - 1)){
            return false;
        }
        return checkPallindrome(str, pos + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(checkPallindrome(str, 0));
        scan.close();
    }
}
