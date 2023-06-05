package Day0405;

public class staticEx {
    static int price;
    public static int returnMethod(int integer){
        return integer;
    }

    static{
        price=returnMethod(200);
    }
}
