package June06;

public class Rotate {
    public static void main(String args[]){
        int[] arr={2,5,6,3,1,4,0};
        int pos=4;
        int len=arr.length;
        int[] temp= new int[len];
        for(int i = 0; i < pos; i++) {
            temp[i] = arr[i];
        }
        for(int i = pos; i < len; i++) {
            arr[i - pos] = arr[i];
        }
        for(int i = len - pos; i < len; i++) {
            arr[i] = temp[i - len + pos];
        }
        System.out.println("Rotated array");
        for(int i=0;i<temp.length;i++){
            System.out.println(arr[i]);
        }
    }
}
