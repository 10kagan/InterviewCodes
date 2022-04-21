package part4;

public class _3FindAllSubstring {
    public static void main(String[] args) {
        String str = "Kagan";
        findAllSubsstrings(str);
    }
    public static void findAllSubsstrings(String str){
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1; j <= str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
