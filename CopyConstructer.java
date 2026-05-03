public class CopyConstructer{
    int data;
    public CopyConstructer(int d){
        data=d;
    }
    public CopyConstructer(CopyConstructer d1){
        data=d1.data;
    }
    public static void main(String[] args) {
        CopyConstructer d1 = new CopyConstructer(10);
        CopyConstructer d2 = new CopyConstructer(d1);
        System.out.println("Data in d1: " + d1.data);
    }
}