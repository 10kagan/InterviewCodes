package Chain50JavaCore;

import java.util.PriorityQueue;

public class KthLargest {
    public static int findKthLargest(int[] nums, int k){
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        if (k < 1 || k > nums.length){
            throw new IllegalArgumentException("k is out of range");
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : nums){
            minHeap.offer(n);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
    }
}

// Find the k-th largest element in an array