package com.techlabs.doortest;

import com.techlabs.testrequirements.BarkRecognizer;
import com.techlabs.testrequirements.DogDoor;
import com.techlabs.testrequirements.Remote;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		System.out.println("Fido barks to go outside...");
		recognizer.recognize("Woof Woof");
		//remote.pressButton();
		System.out.println("\nFido has gone outside...");
		// remote.pressButton();
		System.out.println("\nFido's all done...");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("...but he's stuck outside");
		System.out.println("\nFido starts barking...");
		//System.out.println("...so Gina grabs the remote");
		//remote.pressButton();
		recognizer.recognize("Woof Woof");
		System.out.println("\nFido's back inside...");
	}
}
