package com.multi;

class Chandan extends Thread {// Primary Thread
	DocumentAssistant da;
	NotificationAssistant na;

	public Chandan() {// create daemon threads
		da = new DocumentAssistant();
		na = new NotificationAssistant();
		da.setDaemon(true);
		na.setDaemon(true);
		 da.setName("Chandan");
		 na.setName("Chandan");
	}

	@Override
	public void run() {

		da.start();
		na.start();

		try {
			
			System.out.println("Chandan comes to the office.");
			Thread.sleep(3000);
			System.out.println();

			System.out.println("Chandan working on project A");
			Thread.sleep(5000);
			System.out.println();

			System.out.println("Chandan went back home.");
			System.out.println("Chandan finished → assistants will stop automatically.");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Kishore extends Thread {// Primary Thread

	DocumentAssistant da;
	NotificationAssistant na;

	public Kishore() {// create daemon threads
		da = new DocumentAssistant();
		na = new NotificationAssistant();
		da.setDaemon(true);
		na.setDaemon(true);
		da.setName("Kishore");
		na.setName("Kishore");
	}

	@Override
	public void run() {

		da.start();
		na.start();

		try {
			
			System.out.println("Kishore comes to the office.");
			Thread.sleep(3000);

			System.out.println();
			System.out.println("Kishore working on project B");
			Thread.sleep(5000);

			System.out.println();
			System.out.println("Kishore went back home.");
			System.out.println("kishore finished → assistants will stop automatically.");


		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class DocumentAssistant extends Thread {// helper Thread or daemon thread

	@Override
	public void run() {
		while (true) {
			System.out.println(getName()+"'s Document Assistant keeps generating reports...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}

	}
}

class NotificationAssistant extends Thread {// helper Thread or daemon thread

	@Override
	public void run() {
		while (true) {
			System.out.println(getName()+"'s Notification Assistant keeps alerting...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}

	}
}

public class Deamon2 {
	public static void main(String[] args) {

		Chandan chandan = new Chandan();
		Kishore kishore = new Kishore();

		chandan.start();
		kishore.start();
	}

}
