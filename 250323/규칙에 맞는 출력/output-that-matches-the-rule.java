import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            int cnt = N - i + 1;
            for (int m = 1; m <= i; m++) {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println(" ");
        }
    }
}