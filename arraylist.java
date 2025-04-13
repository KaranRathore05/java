import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);
        // add between arraylisy

        list.add(1, 1);
        System.out.println(list);

        // to change arraylsit postion
        list.set(0, 5);
        System.out.println(list);
         System.out.println(list.size());
    }
}//end of program
