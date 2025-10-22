package Chain100Days;

public class TitleCaseConverter {
    public static void main(String[] args) {
        System.out.println(toTitleCase("hello world"));        // ➜ Hello World
        System.out.println(toTitleCase("JAVA is FUN"));        // ➜ Java Is Fun
        System.out.println(toTitleCase("tHis is a tEsT"));     // ➜ This Is A Test
    }
    public static String toTitleCase (String input){
        if (input == null || input.isEmpty()) return input;

        String [] words = input.toLowerCase().split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words){
            if (word.length() > 0){
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");

            }
        }
        return titleCase.toString().trim();
    }
}
// Convert a string to title case (capitalize each word).