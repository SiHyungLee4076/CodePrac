import java.util.Scanner;

public class Main {
    public static String str;
    public static String target;
    public static int func() {
        int len1 = str.length();
        int len2 = target.length();

        if (len1 < len2) {
            return -1;
        }

        for (int i = 0; i <= len1 - len2; i++) {
            boolean check = true;
            for (int j = 0; j < len2; j++) {
                if (str.charAt(i + j) != target.charAt(j)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        target = sc.next();
        int result = func();
        System.out.println(result);
    }
}