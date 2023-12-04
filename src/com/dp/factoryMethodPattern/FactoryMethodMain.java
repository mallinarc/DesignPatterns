package com.dp.factoryMethodPattern;

public class FactoryMethodMain {

	public static void main(String[] args) {
		Restaurant beefRestaurant = new BeefBurgerRestaurant();
		Burger beefBurger = beefRestaurant.orderBurger("Beef");
		Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
		Burger veggieBurger = veggieRestaurant.orderBurger("Veggie");

	}

}
