package com.multi;

class Dk extends Thread {

	public Dk(ThreadGroup ts, String name) {
		super(ts, name);
	}

	@Override
	public void run() {
		System.out.println();
		Thread t = currentThread();
		System.out.println("dk " + t);
		System.out.println();

	}
}

class Dc extends Thread {
	public Dc(ThreadGroup td, String name) {
		super(td, name);
	}

	@Override
	public void run() {
		// Thread t=currentThread();
		System.out.println(getName());
		setName("Dileep");
		System.out.println(getName());
		System.out.println(getThreadGroup());
		System.out.println("priorty " + getPriority());
		setPriority(3);
		System.out.println("seted priorty " + getPriority());
		System.out.println("ID " + getId());
		System.out.println(getThreadGroup());
		System.out.println();

	}
}

public class Methods {

	public static void main(String[] args) throws Exception {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		t.setName("Main Method Renamed");
		System.out.println(t.getName());

		t.setPriority(t.MAX_PRIORITY);
		System.out.println(t.getPriority());

		System.out.println(t.isAlive());
		System.out.println(t.getThreadGroup());

		ThreadGroup tg = new ThreadGroup("Dillep");// custom thread group
		System.out.println("My own group name " + tg.getName());

		Dk d1 = new Dk(tg, "Kumar");

		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		Dc d2 = new Dc(mainGroup, "seted Name Shivu");

		d1.start();
		d1.join();// until thread d1 complete it will not go to the next
		d2.start();
		d2.join();
//		 d1.run();
//		 d2.run();

		System.out.println("-----Main thread completed------");
		System.out.println();

	}

}
