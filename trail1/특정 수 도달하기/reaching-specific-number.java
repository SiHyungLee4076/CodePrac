import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            if (arr[j] >= 250) {
                break;
            } else {
                sum += arr[j];
                count++;
            }
        }

        if (count > 0) {
            avg = (double) sum / count;
        }

        System.out.printf("%d %.1f\n", sum, avg);
    }
}