package June15;

import java.util.Arrays;

public class Capitalize {
    public static void main(String args[]){
        String[] small={"sai","hari","shashank","nithin","vijay"};
        Arrays.stream(small).map(x->x.substring(0,1).toUpperCase()+x.substring(1)).forEach(System.out::println);
    }
}