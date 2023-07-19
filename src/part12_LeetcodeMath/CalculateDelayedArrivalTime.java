package part12_LeetcodeMath;

public class CalculateDelayedArrivalTime {
    public static void main(String[] args) {
        int arrivalTime = 15, delayedTime = 5;
//        Output: 20
//        Explanation: Arrival time of the train was 15:00 hours. It is delayed by 5 hours. Now it will reach at 15+5 = 20 (20:00 hours).
        System.out.println(findDelayedArrivalTime(arrivalTime, delayedTime));
    }
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if (arrivalTime + delayedTime >= 24){
            return arrivalTime + delayedTime -24;
        } else {
            return arrivalTime + delayedTime;
        }
    }
}
