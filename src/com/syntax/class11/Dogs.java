package com.syntax.class11;

public class Dogs {
	String breed;
	String color;
	String name;
	char gender;
	boolean neutered;
	int weight;
	int age;
	
	void eat() {
		System.out.println(breed + " "+ name+ " ikes to eat");
	}
	
	void bark() {
		System.out.println(breed + " "+ name+" barks all the time");}
	
	void playFetch() {
		System.out.println(breed + " "+ name+" loves to play fetch");}
	
	public static void main(String[] args) {
		
	Dogs husky=new Dogs();
	husky.breed="Husky";
	husky.color="Gray";
	husky.name="Bella";
	husky.gender='F';
	husky.neutered=true;
	husky.weight=100;
	husky.age=7;
	
	husky.eat();
	husky.bark();
	husky.playFetch();
	
	Dogs bulldog=new Dogs();
	bulldog.breed="Bulldog";
	bulldog.color="white";
	bulldog.name="Davey";
	bulldog.gender='M';
	bulldog.neutered=true;
	bulldog.weight=90;
	bulldog.age=6;
	
	bulldog.eat();
	bulldog.bark();
	bulldog.playFetch();
	
	Dogs labrador=new Dogs();
	labrador.breed="Labrador";
	labrador.color="golden";
	labrador.name="Stark";
	labrador.gender='M';
	labrador.neutered=true;
	labrador.weight=40;
	labrador.age=3;
	
	labrador.eat();
	labrador.bark();
	labrador.playFetch();
	
	}
	

}
