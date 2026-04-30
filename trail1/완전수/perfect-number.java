import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int j = start; j <= end; j++) {
            if (j <= 1) {
                continue;
            }
            
            int sum = 1;

            for (int k = 2; k <= j / 2; k++) {
                if (j % k == 0) {
                    sum += k;
                }
            }

            if (sum == j) {
                count++;
            }
        }

        System.out.println(count);
    }
}