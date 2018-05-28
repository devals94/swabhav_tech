package com.isp.violation.test;

import com.isp.violation.IWorker;
import com.isp.violation.Manager;
import com.isp.violation.Robot;

public class TestIspViolation {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		atTheWorkStation(manager);
		atTheWorkStation(robot);
		atTheCafeteria(manager);
		atTheCafeteria(robot);
	}

	public static void atTheCafeteria(IWorker worker) {
		System.out.println("At the Cafeteria: ");
		worker.startEat();
		worker.stopEat();
		System.out.println();
	}

	public static void atTheWorkStation(IWorker worker) {
		System.out.println("At the WorkStation: ");
		worker.startWork();
		worker.stopWork();
		System.out.println();
	}
}
