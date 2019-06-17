package au.com.shop.service;

import au.com.shop.Basket;
import au.com.shop.Category;
import au.com.shop.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasketService {

    private Basket basket;
    private Random randomValue = new Random();

    public BasketService() {
        this.basket = new Basket();
    }

    public Basket fillBasket() {
        for (Category category : generateCategories()) {
            List<Item> items = category.items;
            Item item = items.get(randomValue.nextInt(items.size()));
            if (!addItemToBasket(basket, item)) {
                break;
            }
        }
        return basket;
    }

    private boolean addItemToBasket(Basket basket, Item item) {
        basket.items.add(item);
        if (basket.totalCost() > 50) {
            basket.items.remove(item);
            return false;
        }
        return true;
    }


    private List<Category> generateCategories() {
        List<Category> categories = new ArrayList<Category>();

        for (int i = 1; i <= 20; i++) {
            Category category = new Category();
            category.id = i;
            category.items = generateItems(i);
            categories.add(category);
        }
        return categories;
    }


    private List<Item> generateItems(int categoryId) {

        List<Item> items = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Item item = new Item("Category"+categoryId + "- Item" + i, assignPrice(), assignShippingCost(), assignRating());
            items.add(item);
        }
        return items;
    }


    private int assignPrice() {
        return 1 + randomValue.nextInt(20);
    }

    private int assignShippingCost() {
        return (int) (Math.random() * ((5 - 2) + 1)) + 2;
    }

    private int assignRating() {
        return 1 + randomValue.nextInt(5);
    }

}
