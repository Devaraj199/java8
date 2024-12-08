package stream;

public class Products {
    private String pName;
    private int price;

    public Products(String pName, int price) {
        this.pName = pName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "pName='" + pName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
