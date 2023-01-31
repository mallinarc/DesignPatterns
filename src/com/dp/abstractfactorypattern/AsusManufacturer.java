package com.dp.abstractfactorypattern;

public class AsusManufacturer extends Company {

	@Override
	public Gpu createGpu() {
		return new AsusGpu();
	}

	@Override
	public AsusMonitor createMonitor() {
		return new AsusMonitor();
	}

}
