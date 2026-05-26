import java.util.*;

public class Main {
    public static boolean func(String str) {
        char first = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != first) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (func(A)) {
            System.out.println("Yes");
        } 
        else {
            System.out.println("No");
        }
    }
}