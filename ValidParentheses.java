import java.util.*;

public class ValidParentheses{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("Enter a String of Brackets:");
            String s = sc.next();
            System.out.println("Valid:" + isValid(s));
            System.out.println("Would you like to go again? (yes/no)");
            if(sc.next().equalsIgnoreCase("no")) run = false;
        }
        System.out.println("Have a great day:)");
    }
    public static boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){
                stack.push(')');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(c == '['){
                stack.push(']');
            } else {
                
                if(stack.isEmpty()) return false;
                if(stack.peek() != c) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    
}
