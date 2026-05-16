import java.util.Scanner;

public class Main {
    public static int func(int num) {
        int sum = 0;
        for(int i = 0; i <= num; i++) {
            sum += i;
        }
        int n = sum / 10;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = func(num);
        System.out.println(result);
    }
}