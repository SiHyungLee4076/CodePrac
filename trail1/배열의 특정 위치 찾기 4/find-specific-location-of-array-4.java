import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                count++;
                sum += num;
            }
        }

        System.out.println(count + " " + sum);
    }
}