package com.Polymorohism;

import java.util.Scanner;

class Upender{
	void forms() {
		System.out.println("Upendra is Human.");
	}
	
}
class Actor extends Upender{
	@Override
	void forms() {
		System.out.println("Upendra is Actor.");
	}
	void bestMoviesAsActor() {
		System.out.println("Upendra best movie as actor is A ");
	}
}

class Director extends Upender{
	@Override
	void forms() {
		System.out.println("Upendra is Director.");
	}
	void bestMovies() {
		System.out.println("Upendra best movie as director is A ");
	}
}

class Singer  extends Upender{
	@Override
	void forms() {
		System.out.println("Upendra is Singer.");
	}
	void bestSongs() {
		System.out.println("Upendra best songs omm ");
	}
}


class Producer  extends Upender{
	@Override
	void forms() {
		System.out.println("Upendra is Producer.");
	}
	void producedMovies() {
		System.out.println("Upendra produced movies  Kabza");
	}
}

class FilmIndustry{
	
	void getInfo(String s) 
	{
		Upender u=null;
		if(s.equalsIgnoreCase("Singer"))
		{  u= new Singer();
			u.forms();
			((Singer)u).bestSongs();
		}
		else if(s.equalsIgnoreCase("Director"))
		{ 
			u=new Director();
			u.forms();
			((Director)u).bestMovies();
		}
		else if(s.equalsIgnoreCase("singer")) {
			u=new Singer();
			(( Singer)u).bestSongs() ;
		}
		else if(s.equalsIgnoreCase("Producer")){
			u=new Producer();
			(( Producer)u).producedMovies() ;
		}
		else {
			System.out.println("Please enter among 4");
		}
			
	}
}
public class Polymorphism {
	public static void main(String [] arr) {
	FilmIndustry film=new FilmIndustry();
	
     Scanner sc=new Scanner(System.in);
	 System.out.println("Upendra as \n1.director \n2.Actor \n3.singer \n4.producer");
	 String s=sc.next();
	 film.getInfo(s);
	

}
}
