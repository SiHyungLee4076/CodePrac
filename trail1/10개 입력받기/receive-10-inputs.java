import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            count++;
        }

        System.out.printf("%d %.1f", sum, (double) sum / count);
    }
}