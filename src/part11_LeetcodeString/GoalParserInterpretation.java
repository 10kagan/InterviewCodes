package part11_LeetcodeString;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
    //        Output: "Goal"
    //        Explanation: The Goal Parser interprets the command as follows:
    //        G -> G
    //                () -> o
    //                (al) -> al
    //        The final concatenated result is "Goal".
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        String[] arr = command.split("");

        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("G")) {
                result.append("G");
            } else if (arr[i].equals("(") && arr[i + 1].equals(")")) {
                result.append("o");
                i++;
            } else if (arr[i].equals("(") && arr[i + 1].equals("a")) {
                result.append("al");
                i += 3;
            }
        }
        return result.toString();
    }
}
