package June06;

public class Rotate {
    public static void main(String args[]){
        int[] arr={2,5,6,3,1,4,0};
        int pos=4;
        for(int i=pos;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int j=0;j<pos;j++){
            System.out.println(arr[j]);
        }
    }
}
