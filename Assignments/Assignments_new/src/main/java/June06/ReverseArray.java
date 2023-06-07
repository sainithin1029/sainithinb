package June06;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]){
        int[] arr={2,3,6,7,8};
        int[] result=new int[arr.length];
        System.out.println("Initial Array:"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){

            result[i] = arr[arr.length-i-1];

        }
        System.out.println("Reverse array:" +Arrays.toString(result));


    }

}
