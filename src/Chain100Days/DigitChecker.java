package Chain100Days;

public class DigitChecker {
    public static void main(String[] args) {
        System.out.println(isOnltDigits("123456"));    // true
        System.out.println(isOnltDigits("123a456"));   // false
        System.out.println(isOnltDigits(""));          // false (opsiyonel: boş string geçerli mi?)
        System.out.println(isOnltDigits("007"));       // true
    }
    public static boolean isOnltDigits(String str){
        if (str == null || str.isEmpty()) return false;

        for (char c : str.toCharArray()){
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
