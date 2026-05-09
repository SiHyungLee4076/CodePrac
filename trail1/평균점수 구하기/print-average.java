import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        for (int i = 0; i < 8; i++) {
            double d = sc.nextDouble();
            sum += d;
        }

        double avg = sum / 8.0;

        System.out.printf("%.1f", avg);
    }
}