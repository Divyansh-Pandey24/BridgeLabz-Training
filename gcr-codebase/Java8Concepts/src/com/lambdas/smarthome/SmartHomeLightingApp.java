package com.lambdas.smarthome;

import java.util.Scanner;

public class SmartHomeLightingApp {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// create a sample smart light
	SmartLight livingRoomLight = new SmartLight("Living Room Light");

	System.out.println("Smart Home Lighting Automation Demo");
	System.out.print("Enter trigger (motion / evening / voice / off / exit): ");

	while (true) {
	    System.out.print("\nTrigger: ");
	    String trigger = input.nextLine().trim().toLowerCase();

	    if (trigger.equals("exit")) {
		System.out.println("Exiting...");
		break;
	    }

	    // define different behaviors using lambdas (no extra classes needed)
	    LightBehavior behavior;

	    switch (trigger) {
	    case "motion":
		behavior = (c1) -> System.out.print("Motion detected → Bright full light! ");
		break;

	    case "evening":
		behavior = (c2) -> System.out.print("Evening time → Warm dim glow! ");
		break;

	    case "voice":
		behavior = (c3) -> System.out.print("Voice command → Color changing party mode! ");
		break;

	    case "off":
		behavior = (c4) -> System.out.print("Turn off command → Lights going dark. ");
		break;

	    default:
		System.out.println("Unknown trigger. Try motion/evening/voice/off/exit");
		continue;
	    }

	    // apply the dynamically chosen lambda behavior
	    livingRoomLight.applyBehavior(behavior, trigger);
	    System.out.println(livingRoomLight);
	}

	input.close();
    }
}