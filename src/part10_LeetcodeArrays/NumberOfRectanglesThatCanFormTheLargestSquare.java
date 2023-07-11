package part10_LeetcodeArrays;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public static void main(String[] args) {
        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
//        Output: 3
//        Explanation: The largest squares you can get from each rectangle are of lengths [5,3,5,5].
//        The largest possible square is of length 5, and you can get it out of 3 rectangles.
        System.out.println(countGoodRectangles(rectangles));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        int count = 0;
        int largestSquareLength = 0;

        for (int i = 0; i < rectangles.length; i++) {
            int squareLength = Math.min(rectangles[i][0], rectangles[i][1]);

            if (squareLength > largestSquareLength) {
                largestSquareLength = squareLength;
                count = 1;
            } else if (squareLength == largestSquareLength) {
                count++;
            }
        }
        return count;
    }
}