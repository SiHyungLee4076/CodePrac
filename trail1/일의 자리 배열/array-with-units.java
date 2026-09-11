import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pp = sc.nextInt();
        int p = sc.nextInt();

        System.out.print(pp + " " + p + " ");

        for (int i = 3; i < 11; i++) {
            int temp = (pp + p) % 10;

            pp = p;
            p = temp;

            System.out.print(temp + " ");
        }
    }
}