package com.ocp.solution.test;

import com.ocp.solution.*;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fixedDepositOfRohan = new FixedDeposit(100,
				"Rohan Malhotra", 1_00_000, 10, new Holi());
		FixedDeposit fixedDepositOfKriya = new FixedDeposit(100, "Kriya Mehta",
				5_00_000, 5, new NewYear());

		System.out.println(fixedDepositOfRohan.calculateSimpleInterest());
		System.out.println(fixedDepositOfKriya.calculateSimpleInterest());
	}

}
