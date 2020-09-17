package org.pictolearn.docker;

public class HelloWorldPing {

	public static void main(String args[]) throws Exception {
		for (int i = 0; i < 30; i++) {
			System.out.println("Hello Omar Ping " + i);
			Thread.sleep(1000);
		}
	}
}
