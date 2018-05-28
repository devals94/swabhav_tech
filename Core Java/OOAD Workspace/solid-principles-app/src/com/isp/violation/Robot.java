package com.isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot starts working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stops working");
	}

	@Override
	public void startEat() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void stopEat() {
		throw new UnsupportedOperationException();
	}

}
