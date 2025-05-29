import java.util.Stack;

public class Valid_Paranthesis {
    public static boolean isvalid(String str) {
        Stack<Character>st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch  = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size()==0) {
                    return false;
                }
                char top = st.pop();
                if ((top == '(' && ch == ')') ||
                        (top == '{' && ch == '}') ||
                        (top == '[' && ch == ']')) {
                } else {
                    return false;
                }
            }
        }
        return st.size() == 0;
    }
    public static void main(String[] args) {
        String str1 = "()[]{}";
        String str2 = "([{}])";
        String str3 = "(]";
        String str4 = "([)]";

        System.out.println(str1 + " → " + isvalid(str1));
        System.out.println(str2 + " → " + isvalid(str2));
        System.out.println(str3 + " → " + isvalid(str3));
        System.out.println(str4 + " → " + isvalid(str4));
    }
}
