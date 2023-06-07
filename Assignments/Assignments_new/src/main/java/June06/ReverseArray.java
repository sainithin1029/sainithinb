package June06;

public class ReverseArray {
    public static void main(String args[]){
        int[] arr={2,3,6,7,8};
        System.out.println("Initial Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reversed Array:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

}
