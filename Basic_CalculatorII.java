import java.util.Stack;

public class Basic_CalculatorII {
    public int calculate(String s){
        Stack<Integer> numberStack = new Stack();
        int number = 0;
        char operator = '+';
        for(int i =0;i<s.length();i++){
           if(Character.isDigit(s.charAt(i))){ number =(number *10)+(S.charAt(i) - '0');


        }
            if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
                if(operator =='-'){
                    stack.push(-number);
                }if(operator =='+'){
                    stack.push(number);
                }if(operator =='*'){
                    stack.push(stack.pop()*num);
                }if(operator =='/'){
                    stack.push(stack.pop()/number);
                }
                sign =s.charAt(i);
            )
        }
    }
}
