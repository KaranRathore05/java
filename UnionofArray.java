import java.util.HashSet;

public class UnionofArray {
    public static int union(int arr1[],int arr2[]){
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < arr1.length; i++) {
                set.add(arr1[i]);
                
            }for (int j = 0; j < arr2.length; j++) {
                set.add(arr2[j]);
                
            }return set.size();
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 7, 7, 5, 3, 4, 2 };
        int arr2[] = { 7, 7, 7, 5, 3, 4, 2 };
        System.out.println("The union of the two arrays is: " + union(arr1, arr2));
    }

}
