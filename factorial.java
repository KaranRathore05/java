
import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int sum= calculate(n);
        System.out.println(sum);

    }
public static int calculate(int n) {
    int factorial = 1;
    for(int i =n ;i>=1;i--){
        factorial = factorial*i;
        
    }
    return factorial;
    
}
}
