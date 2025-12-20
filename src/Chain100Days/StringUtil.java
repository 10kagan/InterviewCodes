package Chain100Days;

public class StringUtil {
    public static boolean isOnlyDigits(String s){
        if (s == null || s.isEmpty()){return false;}

        for (int i = 0; i < s.length(); i++){
            if (!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
