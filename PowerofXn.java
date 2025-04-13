public class PowerofXn {
    public static void main(String[] args) {
        int x=2 ,n=5;
       int ans= cal(x,n);
        System.out.println(ans);
    }

    public static int cal(int x ,int n) {
        if(x==0){return 0;}
        if(n==0){return 1;}
        int cPower =cal(x,n-1);
        int xPower =x*cPower;
        
        return xPower;

        
    }
}

