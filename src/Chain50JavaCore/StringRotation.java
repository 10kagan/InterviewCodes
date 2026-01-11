package Chain50JavaCore;

public class StringRotation {
    public static boolean isRotation(String a, String b){
        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;

        if (a.isEmpty()) return true;

        String doubled = a + a;
        return doubled.contains(b);
    }
    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat")); // true
        System.out.println(isRotation("abcd", "cdab"));              // true
        System.out.println(isRotation("abcd", "acbd"));              // false
        System.out.println(isRotation("", ""));                      // true
    }
}

// Check if one string is a rotation of another.