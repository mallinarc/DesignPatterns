package com.dp.abstractfactorypattern;

public class MsiManufacturer extends Company {

	@Override
	public Gpu createGpu() {
		return new MsiGpu();
	}

	@Override
	public MsiMonitor createMonitor() {

		return new MsiMonitor();
	}

}
