import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = n*n;
        System.out.println(w);
        if(n < 5) {
            System.out.println("tiny");
        }
    }
}