import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            int ten = (num / 10) % 10;
            arr[ten]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + arr[i]);
        }
    }
}