package June15;

import java.util.Arrays;

public class Avg {
    public static void main(String args[]){
        int[] a={3,9,29,38,24,48,98};
        System.out.println(Arrays.stream(a).filter(x->x%2!=0).map(x->x*x).average().toString());
    }
}