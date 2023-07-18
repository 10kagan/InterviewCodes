package part11_LeetcodeString;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
//        Output: "()()()"
//        Explanation:
//        The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//                After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder outerParentheses = new StringBuilder();
        int openCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
                if (openCount > 1) {
                    outerParentheses.append('(');
                }
            } else if (s.charAt(i) == ')') {
                openCount--;
                if (openCount > 0) {
                    outerParentheses.append(')');
                }
            }
        }
        return outerParentheses.toString();
    }
}
