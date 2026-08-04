import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[1000];
        int count = 0;
        
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            arr[count] = num;
            count++;
            
            if (num == 0) {
                break;
            }
        }
        
        int index = count - 1;
        int sum = arr[index - 1] + arr[index - 2] + arr[index - 3];
        
        System.out.println(sum);
    }
}