package June07;

public class Vowels {
    public static void main(String args[]) {


        String str = new String("sainithinAEIOU");
        int count=0;
        String vowel="aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u' || str.charAt(i) =='A' || str.charAt(i) =='E' || str.charAt(i) =='I' || str.charAt(i) =='O' || str.charAt(i) =='U' ){
                count=count+1;
            }
        }
        System.out.println("No. Of Vowels:"+count);
    }
}
