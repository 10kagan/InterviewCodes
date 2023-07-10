package part10_LeetcodeArrays;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
//        Output: [[1,0,0],[0,1,0],[1,1,1]]
//        Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//        Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length - 1 - j];
                image[i][image[i].length - 1 - j] = temp;
            }
        }
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                if (image[i][j] == 0){
                    image[i][j] = 1;
                } else
                    image[i][j] = 0;
            }
        }
        return image;
    }
}
