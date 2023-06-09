package part9_leetcode75;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int [] gain = {-5,1,5,0,-7};
        //Output: 1
        //Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int result = 0;
        int currentAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            result = Math.max(result, currentAltitude);
        }

        return result;
    }
}
