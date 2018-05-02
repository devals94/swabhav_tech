package com.techlabs.interfacepoly;

public class Boy implements IMannerable, IEmotionable {

	@Override
	public void wish() {
		System.out.println("Boy Wishing");
	}

	@Override
	public void depart() {
		System.out.println("Boy Departing");
	}

	@Override
	public void cry() {
		System.out.println("Boy Crying");

	}

	@Override
	public void laugh() {
		System.out.println("Boy laughing");

	}

}
