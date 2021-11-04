package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of Dog class
Dog zemasDog= new Dog();
zemasDog.name="Lexy";
zemasDog.breed="american hound";
zemasDog.color="black";
zemasDog.height=2.5;
zemasDog.age=10;
zemasDog.gender='M';
System.out.println("My dogs name is " + zemasDog.name);
System.out.println("His breed is " +zemasDog.breed);
System.out.println("His color is "+zemasDog.color);

Dog JimmysDog= new Dog();
JimmysDog.name="Teddy";
JimmysDog.breed="Labrador";
JimmysDog.color="Golden";
JimmysDog.height=5;
JimmysDog.age=5;
JimmysDog.gender='M';
System.out.println("My dogs name is " + JimmysDog.name);
System.out.println("His breed is " +JimmysDog.breed);
System.out.println("His color is "+JimmysDog.color);

Dog arwasDog=new Dog();
arwasDog.name="Monroe";
System.out.println("Arwas dog is "+arwasDog.name);


	}

}
