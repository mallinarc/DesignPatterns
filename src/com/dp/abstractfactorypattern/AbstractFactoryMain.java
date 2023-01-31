package com.dp.abstractfactorypattern;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		Company msiCompany = new MsiManufacturer();
		Gpu msiGpu = msiCompany.createGpu();
		Monitor msiMonitor = msiCompany.createMonitor();

		Company asusCompany = new AsusManufacturer();
		Gpu asusGpu = asusCompany.createGpu();
		Monitor asusMonitor = asusCompany.createMonitor();

	}

}
