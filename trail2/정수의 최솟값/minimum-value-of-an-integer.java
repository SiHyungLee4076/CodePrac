import java.util.*;

public class Main {
    public static int func(int a, int b, int c) {
        int temp = a;
        if (temp > b) {
            temp = b;
        }
        if (temp > c) {
            temp = c;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(func(a, b, c));
    }
}
