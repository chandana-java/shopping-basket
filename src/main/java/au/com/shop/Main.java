package au.com.shop;

import au.com.shop.service.BasketService;

public class Main {

    public static void main(String[] args) {
        BasketService service = new BasketService();
        Basket basket = service.fillBasket();

        System.out.println("TOTAL COST = " + basket.totalCost());
        System.out.println("ITEMS IN BASKET = " + basket);
        System.out.println("TOTAL RATING IN BASKET = " + basket.totalRating());
    }


}
