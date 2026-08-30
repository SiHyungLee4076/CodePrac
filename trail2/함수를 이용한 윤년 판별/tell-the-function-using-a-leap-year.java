import java.util.Scanner;

public class Main {
    public static boolean func(int y) {
        if (y % 400 == 0) {
            return true;
        }
        if (y % 100 == 0) {
            return false;
        }
        return y % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.println(func(y));
    }
}