package au.com.shop;

import java.util.List;

public class Category {

    public int id;
    public List<Item> items;

    @Override
    public String toString() {
        return "au.com.shop.Category{" +
                "id=" + id +
                ", items=" + items +
                '}'+"\n";
    }
}
