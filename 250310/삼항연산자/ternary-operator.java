import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        int level = score == 100 ? 0 : 1;
        if(level == 0) {
            System.out.println("pass");
        } else {
            System.out.println("failure");
        }
    }
}