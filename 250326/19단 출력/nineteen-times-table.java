public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                if (j % 2 == 1 && j != 19) {
                    System.out.printf("%d * %d = %d ", i, j, i*j);
                    System.out.print("/ ");
                }
                else if (j == 19) {
                    System.out.printf("%d * %d = %d ", i, j, i*j);
                }
                else {
                    System.out.printf("%d * %d = %d ", i, j, i*j);
                    System.out.println("");
                }
            }
            System.out.println("");
        }
    }
}