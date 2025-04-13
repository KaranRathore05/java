import java.util.HashSet;

public class uniquesubsiquence {
    public static void printSubseq(String str, int idx, String newString, HashSet<String> allSubseq) {
        if (idx == str.length()) {
            if (allSubseq.contains(newString)) {
                return;
            }
            allSubseq.add(newString);
            System.out.println(newString);
            return;
        }

    }

    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";
        HashSet<String> allSubseq = new HashSet<>();
        printSubseq(str2, 0, "", allSubseq);
    }

}