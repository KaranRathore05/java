
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            name[i] = sc.nextLine();

        }

        for (int i = 0; i <= n; i++) {
            System.out.println(name[i]);
        }
    }

}
