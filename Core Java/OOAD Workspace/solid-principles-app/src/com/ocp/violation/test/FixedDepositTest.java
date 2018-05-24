package com.ocp.violation.test;

import com.ocp.violation.FixedDeposit;
import com.ocp.violation.FestivalType;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fixedDepositOfRohan = new FixedDeposit(100,
				"Rohan Malhotra", 1_00_000, 10, FestivalType.HOLI);
		FixedDeposit fixedDepositOfKriya = new FixedDeposit(100, "Kriya Mehta",
				5_00_000, 5, FestivalType.NEW_YEAR);
		
		System.out.println(fixedDepositOfRohan.calculateSimpleInterest());
		System.out.println(fixedDepositOfKriya.calculateSimpleInterest());
	}

}
