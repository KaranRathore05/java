public class Trie {
    static class Node {
        Node children[];
        boolean eow;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node current = root; // Temporary pointer to traverse
        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';
            if (current.children[idx] == null) {
                current.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                current.children[idx].eow = true; // Mark end of word
            }
            current = current.children[idx]; // Move the pointer forward
        }
    }

    public static boolean search(String key) {
        Node current = root; // Temporary pointer to traverse
        for (int i = 0; i < key.length(); i++) {

            int idx = key.charAt(i) - 'a';
            if (current.children[idx] == null) {
                return false; // Character not found
            }
            current = current.children[idx]; // Move the pointer forward
        }
        return current.eow; // Check if it's the end of a valid word
    }

    public static boolean Wordbreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        if (search(key)) {
            return true;
        }
        
        for (int i = 1; i < key.length(); i++) {
            String first = key.substring(0, i);
            String secound = key.substring(i);
            if (search(first) && Wordbreak(secound)) {
                return true;

            }

        }
        return false;
    }

    public static  boolean startwith(String prefix){
        Node curr = root;
        for(int i = 0 ; i<prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children == null){
                return false;
                
            }
                curr  = curr.children[idx];
            }
            return true;


          }
    
            public static int countWords(Node root) {
                if (root == null) {
                    return 0;
                }
                int count = 0;
                if (root.eow) {
                    count++;
                }
                for (int i = 0; i < 26; i++) {
                    if (root.children[i] != null) {
                        // Recursively count words in the child node
                        count += countWords(root.children[i]);
                    }
                    
                }
                return count+1;
            }

    public static void main(String[] args) {
        String[] words = { "hello", "world", "hi", "there", "java" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("their")); // Output: false
        System.out.println(search("hi")); // Output: true
        String key = "helloworld";
        System.out.println(Wordbreak(key));
        System.out.println(startwith("he")); // Output: true

        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert( suffix);
        }
    }
}
