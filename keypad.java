public class keypad{
   public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs"};

   public static void keypad(String str, int idx, String combination) {
       if (idx == str.length()) {
           System.out.println(combination);
           return;
       }
       
       char currentChar = str.charAt(idx);
       String mapping = keypad[currentChar - '0'];  // Get the string for the current digit
       for (int i = 0; i < mapping.length(); i++) {
           char letter = mapping.charAt(i);  // Get the current character
           keypad(str, idx + 1, combination + letter);  // Recurse with updated combination
       }
   }

   public static void main(String[] args) {
       String number = "23";
       keypad(number, 0, "");
   }
}
