package com.dp.factoryMethodPattern;

public class BeefBurgerRestaurant extends Restaurant {

	@Override
	public Burger createBurger() {
		return new BeefBurger();
	}

}
