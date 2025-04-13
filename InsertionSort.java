public class InsertionSort {
    public static void main(String[] args) {
       int arr[]={2,1,4,5,6,7,7,8};
        for (int i = 1; i < arr.length; i++) {
             int current =arr[i];
             int j=i-1;
             while(j>= 0 &&current<arr[j]){
                arr[j+1]=arr[j];
            j--;             }
            System.out.print(arr[i]+" ");

        }
                 
            
        }
    }

