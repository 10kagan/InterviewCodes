package part3;

public class _13SecondMostFrequentCharInString {
    static final int NO_OF_CHARS = 256;
    public static void main(String[] args) {

        String target ="SEcond most frequentffffee";

        char result = getSecondMostFreq(target);
        System.out.println(result);
    }

    private static char getSecondMostFreq(String target) {
        int [] count = new int[NO_OF_CHARS];
        int first = 0, second = 0;
        for (int i = 0; i <target.length(); i++){
            (count[target.charAt(i)])++;
            for (int j = 0; j < NO_OF_CHARS; j++){
                if (count[i] > count[first]){
                    second = first;
                    first = i;
                }else if (count[i] > count[second] && count[i] != count[first])
                    second = i;
            }
        }
        return (char) second;
    }
}
