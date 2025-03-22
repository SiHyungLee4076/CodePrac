import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            for(int k = N - i; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(cnt + " ");
                cnt++;
                if (cnt % 10 == 0) {
                    cnt = 1;
                }
            }
            System.out.println("");
        }
    }
}