

public class TotalMaze {
    public static int mazecal(int i,int j,int n,int m ) {
        if(n==i || m==j){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }
        
    
       return  mazecal(i, j+1, n, m) + mazecal(i+1, j, n, m);
    }

    public static void main(String[] args) {
int n =3;
int m=3;
int totalpath = mazecal(0,0,n,m);
System.out.println("the total path : "+" "+ totalpath);
    }
}
