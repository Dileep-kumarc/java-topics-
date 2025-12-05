package com.multi;

class Virat extends Thread {
	private BowlingCoach bowling;
	private BattingCoach batting;

	public Virat() {
		bowling = new BowlingCoach();
		batting = new BattingCoach();

		bowling.setDaemon(true);
		batting.setDaemon(true);
	}

	@Override
	public void run() {// primary object

		bowling.start();
		batting.start();
		try {
			System.out.println("virat enter the stadium........");
			Thread.sleep(5000);

			System.out.println("Virat opening Cricket kit...");
			Thread.sleep(5000);

			System.out.println("Virat started practising the cricket........");
			Thread.sleep(5000);

			System.out.println("Virat takes a break ...");
			Thread.sleep(3000);

			System.out.println("Virat go out of the stadium.........");
			Thread.sleep(5000);

			System.out.println("Virat go to the hotel*********");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class BowlingCoach extends Thread {// Helper thread
	@Override
	public void run() {
		for (;;) {
			System.out.println("Bowling Coach stated helping the Virat on how bowl comes how to takle. ");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class BattingCoach extends Thread {// helper thread
	@Override
	public void run() {
		while (true) {
			System.out.println("Batting Coach stated helping the Virat ");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class Deamon {
	public static void main(String[] args) {
		Virat virat = new Virat();
		virat.start();
	}

}
