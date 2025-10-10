package com.Aggreagation_and_Compostion;

class Heart{
	private String weight;
	private String bPM;
	public Heart(String weight, String bPM) {
		super();
		this.weight = weight;
		this.bPM = bPM;
	}
	 public String  getWeight() {
		return weight;
	}
	 public String getBPM() {
		 return bPM;
	 }
	
}

class Brain{
	private String weight;
	private String color;
	public Brain(String weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	 public String  getWeight() {
		return weight;
	}
	 public String getColor() {
		 return color;
	 }
	
}
class Bike{
	private String brand;
	private String milleage;
	public Bike(String brand, String milleage) {
		super();
		this.brand = brand;
		this.milleage = milleage;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getMilleage() {
		return milleage;
	}	
}


class Book{
	private String name;
	private String author;
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
}

class Student{
	Heart h=new Heart("280 grams","73 BPM");
	Brain b=new Brain("1.3 kg ","greay");
	
	void studentHasbike(Bike bike) {
		System.out.print(bike.getBrand());
		System.out.println(bike.getMilleage());;
	}


	
	 void studentHasBook(Book book) {
		System.out.println(book.getName()); ;
		System.out.println(book.getAuthor()); ;
	 }
}


public  class AggreagtionCompostoion {
	 public static void main(String[] args)  {
	Student s=new Student();
	Bike bike=new Bike("KTM","65 kms");
	Book book=new Book("Rich dad poor dad","Robert Keyodski");
	
	s=null;
//	System.out.println(s.h.getWeight());
//	System.out.println(s.h.getBPM());
//	System.out.println(s.b.getWeight());
//	System.out.println(s.b.getColor());
	
	
	System.out.println(bike.getBrand());
	System.out.println(bike.getMilleage());
//	s.studentHasbike(bike);
//	s.studentHasBook(book);
	
}
}
