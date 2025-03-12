import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    System.out.print(n - cnt);
                }
                else {
                    System.out.print(cnt + 1);
                }
            }
            System.out.println("");
            cnt++;
        }
    }
}