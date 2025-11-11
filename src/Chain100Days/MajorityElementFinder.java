package Chain100Days;

public class MajorityElementFinder {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr)); // Output -> 2
    }
    public static int majorityElement(int [] nums){
        int candidate = 0;
        int count = 0;

        // Boyer–Moore Voting Algorithm
        for (int num : nums){
            if (count == 0){
                candidate = num; // new candidate
            }
            count += (num == candidate) ? 1 : -1;
        }
    return candidate;// problem garanti ediyor ki majority element vardır;
    }
}

// Find the majority element in an array.