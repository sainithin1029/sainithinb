public class runpoly {
    int price;
    public void getParent(){
        System.out.println("Parent");
    }
}
class Child extends runpoly{
    int quantity;
    public void getParent(){
        System.out.println("child");
        
    }
}
