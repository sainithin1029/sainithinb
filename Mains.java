public class Mains{
    public static void main(String args[]){
        runpoly rp=new runpoly();
        rp.getParent();
        Child c= new Child();
        c.getParent();
        runpoly rp1= new Child();
        rp1.getParent();
        
    }
}
