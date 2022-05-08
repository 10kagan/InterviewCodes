package part4.Arrays;

public class _22ArrayConsecutiveElementMain {
    private int getMinimum(int arr[], int n){
        int min = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    private int getMaximum(int arr[], int n){
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }
    public boolean checkArrayContainsConsecutiveElements(int arr[], int n){
        if (n < 1)
            return false;
        int min = getMaximum(arr, n);
        int max = getMaximum(arr, n);
        if (max - min + 1 == n){
            boolean[] visited = new boolean[arr.length];
            for (int i = 0; i < n; i++){
                if (visited[arr[i] - min] != false)
                    return false;
                visited[arr[i] - min] = true;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        _22ArrayConsecutiveElementMain acem=new _22ArrayConsecutiveElementMain();
        int arr[]= {47, 43, 45, 44, 46};

        if(acem.checkArrayContainsConsecutiveElements(arr, arr.length))
            System.out.println(" Array elements are consecutive ");
        else
            System.out.println(" Array elements are not consecutive ");
        return;
    }
}
