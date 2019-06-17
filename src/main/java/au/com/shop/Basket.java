package au.com.shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    public List<Item> items = new ArrayList<Item>();

    public int totalCost() {
        int totalCost = 0;
        for (Item item : items) {
            totalCost = totalCost + (item.price + item.shippingCost);
        }
        return totalCost;
    }

    public int totalRating(){
        int totalRating = 0;
        for (Item item : items) {
            totalRating = totalRating + item.rating;
        }
        return totalRating;

    }

    @Override
    public String toString() {
        return "au.com.shop.Basket{" +
                "items=" + items +
                '}';
    }
}
