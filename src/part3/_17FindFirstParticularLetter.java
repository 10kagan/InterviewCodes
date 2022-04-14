package part3;

public class _17FindFirstParticularLetter {
    public static void main(String[] args) {
        String name = ".,,mnbvcxz";
        System.out.println(findFirstE(name));
    }
    public static int findFirstE (String name){
        int count = 0;
        if (!name.contains("e")){
            return -1;
        }else {
            for (int i = 0; i < name.length(); i++){
                count++;
                if (name.charAt(i) == 'e'){
                    break;
                }
            }
        }return count;
    }
}
