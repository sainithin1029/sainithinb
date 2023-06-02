public class Product {
    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    double getPrice(int quantity){
        return price*quantity;
    }
}
