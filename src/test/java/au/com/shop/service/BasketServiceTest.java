package au.com.shop.service;

import au.com.shop.Basket;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class BasketServiceTest {

    @Test
    public void basketShouldNotBeNull(){
        BasketService service = new BasketService();
        Basket basket = service.fillBasket();
        assertFalse(basket.items.isEmpty());
    }

    @Test
    public void itemsAreUniqueInBasket(){
        BasketService service = new BasketService();
        Basket basket = service.fillBasket();
        assertTrue(basket.items.stream().allMatch(new HashSet<>()::add));
    }


   @Test
    public void getTotalCostLessThan50(){
        BasketService service = new BasketService();
        Basket basket = service.fillBasket();
        assertTrue(basket.totalCost()<50);

    }

    @Test
    public void getTotalRating(){
        BasketService service = new BasketService();
        Basket basket = service.fillBasket();
        assertTrue(basket.totalRating()>0);

    }


}