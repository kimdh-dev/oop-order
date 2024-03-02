package org.example;

public class Customer {
    public void order(String menuMame, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(menuMame);
        Cook cook = cooking.makeCook(menuItem);

    }
}
