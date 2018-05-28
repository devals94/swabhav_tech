package com.isp.solution.test;

import com.isp.solution.IWorkable;
import com.isp.solution.IWorkableFeedable;
import com.isp.solution.Manager;
import com.isp.solution.Robot;

public class TestIspSolution {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		atTheWorkStation(manager);
		atTheWorkStation(robot);
		atTheCafeteria(manager);
		// atTheCafeteria(robot);//This line will should not be used in ISP
		// solution.
	}

	public static void atTheCafeteria(IWorkableFeedable worker) {
		System.out.println("At the Cafeteria: ");
		worker.startEat();
		worker.stopEat();
		System.out.println();
	}

	public static void atTheWorkStation(IWorkable worker) {
		System.out.println("At the WorkStation: ");
		worker.startWork();
		worker.stopWork();
		System.out.println();
	}
}
