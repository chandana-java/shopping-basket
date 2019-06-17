package au.com.shop;

public class Item {

    public String id;
    public int price;
    public int shippingCost;
    public int rating;

    public Item(String id, int price, int shippingCost, int rating) {
        this.id = id;
        this.price = price;
        this.shippingCost = shippingCost;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "au.com.shop.Item{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", shippingCost=" + shippingCost +
                ", rating=" + rating +
                '}'+"\n";
    }
}
