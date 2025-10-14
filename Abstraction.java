package com.Abstraction;

abstract class Bird{
	abstract void eat();
	abstract void fly();
}


abstract class Eagle extends Bird{
	@Override
	void fly() {
		System.out.println("Eagle usally fly heighier.");
	}
}

class Serpenteagle extends Eagle{
	@Override
	void eat() {
		System.out.print("Serpenteagle eat snakes.");
	}
}

class Goldeneagle extends Eagle{
	@Override
	void eat () {
		System.out.println("Goldeneagle eat fish.");
	}
	
}

class Accipitridae{
	void hunt(Bird b) {
		b.fly();
		b.eat();
	}
}

public class Abstration {
	
	public static void main(String [] args) {
		Goldeneagle g=new Goldeneagle();
		Serpenteagle s=new Serpenteagle();
		//Eagle e=new Eagle(); cannot create object of abstract class
		
		Accipitridae a=new Accipitridae();
		
		a.hunt(g);
		a.hunt(s);
}
}package com.Abstraction;

abstract class Bird{
	abstract void eat();
	abstract void fly();
}


abstract class Eagle extends Bird{
	@Override
	void fly() {
		System.out.println("Eagle usally fly heighier.");
	}
}

class Serpenteagle extends Eagle{
	@Override
	void eat() {
		System.out.print("Serpenteagle eat snakes.");
	}
}

class Goldeneagle extends Eagle{
	@Override
	void eat () {
		System.out.println("Goldeneagle eat fish.");
	}
	
}

class Accipitridae{
	void hunt(Bird b) {
		b.fly();
		b.eat();
	}
}

public class Abstration {
	
	public static void main(String [] args) {
		Goldeneagle g=new Goldeneagle();
		Serpenteagle s=new Serpenteagle();
		//Eagle e=new Eagle(); cannot create object of abstract class
		
		Accipitridae a=new Accipitridae();
		
		a.hunt(g);
		a.hunt(s);
}
}
