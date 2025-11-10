package Chain100Days;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 4;

        int result = findKthLargest(arr, k);
        System.out.println(k + "th largest element is: " + result);  // Output: 5
    }
    public static int findKthLargest(int [] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums){
            minHeap.add(num);

            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}

// Find the kth largest element in an array.


/* Aşama	                Açıklama
   PriorityQueue<Integer>	Java’da varsayılan olarak Min Heap’tir
   minHeap.add(num)	        Elemanı kuyruğa ekler
   minHeap.poll()	        En küçük elemanı çıkarır
   minHeap.peek()	        Heap’in en küçük (tepede duran) elemanını verir, bu da k’inci en büyük olandır

 */