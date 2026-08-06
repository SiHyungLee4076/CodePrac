import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if (i % 2 == 1) {
                sum1 += num;
            }
            else {
                sum2 += num;
            }
        }

        int result = Math.abs(sum1 - sum2);

        System.out.println(result);
    }
}
