import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 0; i < N; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                int score = sc.nextInt();
                sum += score;
            }
            double avg = (double)sum/4;
            if (avg >= 60) {
                System.out.println("pass");
                count++;
            }
            else {
                System.out.println("fail");
            }
        }
        System.out.println(count);
    }
}