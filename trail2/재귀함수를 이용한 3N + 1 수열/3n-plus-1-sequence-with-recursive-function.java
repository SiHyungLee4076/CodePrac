import java.util.*;

public class Main {
    public static int func(int n) {
        int count = 0;
        while(true) {
            if (n == 1) {
                break;
            }
            else if (n % 2 == 0) {
                n = n / 2;
                count++;
            }
            else {
                n = n * 3 + 1;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = func(n);
        System.out.println(result);
    }
}