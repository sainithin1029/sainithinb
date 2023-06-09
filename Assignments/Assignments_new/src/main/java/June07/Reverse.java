package June07;

public class Reverse {
    StringBuilder name = new StringBuilder("burj khalifa");
    public void test() {

        int l=name.length();
        for (int i=0;i<l/2;i++) {
            char temp=name.charAt(i);
            name.setCharAt(i,name.charAt(l-i-1));

            name.setCharAt(l-i-1,temp);

        }
        System.out.print(name);
    }
    public static void main(String[] args) {

        Reverse r=new Reverse();
        r.test();

    }

}
