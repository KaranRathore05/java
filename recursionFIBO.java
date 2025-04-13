public class recursionFIBO {
    public static void main(String[] args) {
        int a =0,b=1   ;
        int n=7;
        fibo(n-2, a, b)  ; 
    }
    public static int fibo(int n,int a,int b ) {
       
        if(n==0){
            return  0; 
        }

         int c=a+b;
         System.out.println(c);
       
         return   
         fibo(n-1,b, c);
    }
}

