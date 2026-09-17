import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 1;
        int b = N;
        
        System.out.print(a + " " + b);

        while (true) {
            int c = a + b;
            System.out.print(" " + c);
            if (c > 100) {
                break;
            }
            a = b;
            b = c;
        }
    }
}