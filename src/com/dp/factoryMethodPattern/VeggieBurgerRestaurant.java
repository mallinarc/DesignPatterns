package com.dp.factoryMethodPattern;

public class VeggieBurgerRestaurant extends Restaurant {

	@Override
	public Burger createBurger() {
		// TODO Auto-generated method stub
		return new VeggieBurger();
	}

}
