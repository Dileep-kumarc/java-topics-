package com.multi;

class BathRoom {
	
	public synchronized void use() {
		try {
			System.out.println(Thread.currentThread().getName()+" entring  the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" using the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" leaving  the bathroom");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

class Boy extends Thread {
	BathRoom bt;//brain to store the address of bathroom to use the bathroom resource
	public Boy(BathRoom bt) {
		this.bt=bt;
	}

	@Override
	public void run() {
		bt.use();
	}
}

class Girl extends Thread{
	
	BathRoom bt;
	public Girl(BathRoom bt) {
		this.bt=bt;
	}

	@Override
	public void run() {
		bt.use();
	}
}

class Other extends Thread{
	
	BathRoom bt;
	public Other(BathRoom bt) {
		this.bt=bt;
	}

	@Override
	public void run() {
		bt.use();
	}
}
public class Synchorized {
	public static void main(String[] args) {
		BathRoom bt = new BathRoom();
		Boy b = new Boy(bt);
		Girl g = new Girl(bt);
		Other o = new Other(bt);
		
		b.setName("BOY");
		g.setName("GIRL");
		o.setName("OTHERS");
		
		b.start();
		g.start();
		o.start();
	}

}
