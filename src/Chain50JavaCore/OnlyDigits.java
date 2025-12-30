package Chain50JavaCore;

public class OnlyDigits {

    public static boolean containsOnlyDigits(String str){
        if (str == null || str.isEmpty()) return false;

        for (char c : str.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("12345"));   // true
        System.out.println(containsOnlyDigits("12a45"));   // false
        System.out.println(containsOnlyDigits(""));        // false
        System.out.println(containsOnlyDigits(null));      // false
    }
}

// Check if a string contains only digits