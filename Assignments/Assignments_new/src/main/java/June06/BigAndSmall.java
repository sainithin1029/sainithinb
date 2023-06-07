package June06;

public class BigAndSmall {
    public static void main(String args[]) {


        int[] arr = {2, 4, 1, 6, 8,-1,253,3};
        int max = 0, min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }
}
