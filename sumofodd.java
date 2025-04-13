import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = calculate(n);
        System.out.println(sum);
        

    }

    public static int calculate(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {

                sum += i;

            } else {
                continue;
            }
        }
       
        return sum;

    }
}
