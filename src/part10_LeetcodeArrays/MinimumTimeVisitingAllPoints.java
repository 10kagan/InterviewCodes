package part10_LeetcodeArrays;

public class MinimumTimeVisitingAllPoints {
    public static void main(String[] args) {
        int [][] points = {{3,2},{-2,2}};
//        Output: 7
//        Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
//        Time from [1,1] to [3,4] = 3 seconds
//        Time from [3,4] to [-1,0] = 4 seconds
//        Total time = 7 seconds
        System.out.println(minTimeToVisitAllPoints(points));
    }
    public static int minTimeToVisitAllPoints(int[][] points) {
        int steps = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] point1 = points[i];
            int[] point2 = points[i + 1];
            int maxDistance = Math.max(Math.abs(point1[0] - point2[0]), Math.abs(point1[1] - point2[1]));
            steps += maxDistance;
        }

        return steps;
    }
}
