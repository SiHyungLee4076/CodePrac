import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = a == 1 ? "t" : "f";
        char c = s.charAt(0);
        System.out.println(c);
    }
}