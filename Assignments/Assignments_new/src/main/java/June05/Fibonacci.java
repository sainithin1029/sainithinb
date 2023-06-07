package June05;

public class Fibonacci {
    public static void main(String args[]){
        int n=10;
        int t1=0;
        int t2=1;
        System.out.println(t1);
        System.out.println(t2);
        for(int i=2;i<n;i++){
            int sum=t1+t2;
            t1=t2;
            t2=sum;
            System.out.println(sum);

        }
    }
}
