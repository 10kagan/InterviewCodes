package Chain50JavaCore;

public class ToggleCase {
    public static String toggleCase (String str){
        if (str == null || str.isEmpty()) return str;

        StringBuilder result = new StringBuilder(str.length());
        
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else
                result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toggleCase("Hello World")); // hELLO wORLD
        System.out.println(toggleCase("Java123"));     // jAVA123
        System.out.println(toggleCase("ABCdef"));      // abcDEF
    }
}

// Toggle the case of each character in a string