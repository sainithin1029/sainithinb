package June05;

public class Age {
    public static void main(String args[]) {
        int age = 2;
        if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else if (age < 13) {
            System.out.println("Kid");
        } else {
            System.out.println("Adult");
        }
    }
}
