package part11_LeetcodeString;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        //Output: "1[.]1[.]1[.]1"
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        String[] arr = address.split("\\.");
        String defang = "";

        for (int i = 0; i < arr.length; i++){
            defang += arr[i];
            if (i < arr.length - 1) {
                defang += "[.]";
            }
        }
        return defang;
    }
}
