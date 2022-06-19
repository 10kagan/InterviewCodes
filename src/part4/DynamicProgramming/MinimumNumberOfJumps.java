package part4.DynamicProgramming;

public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int[] A = { 2, 3, 1, 1, 4 };

        int ans = jump(A);
        if(ans == -1)
        {
            System.out.println("Not Possible");
        }
        else {
            System.out.println("Minimum jumps required : " + ans);
        }

    }
    public static int jump(int [] a){
        int maxReachable = 0;
        int jumps = 0;
        int currReachable = 0;
        for (int currIdx = 0; currIdx < a.length; currIdx++){
            maxReachable = Math.max(maxReachable, currIdx + a[currIdx]);
            if (maxReachable <= currIdx)
                return -1;
            if (currIdx == currReachable){
                jumps ++;
                currReachable = maxReachable;
            }
        }
        return jumps;
    }
}
