package com.syntax.class11;

public class Phone {
	String make;
	String model;
	String color;
	int memory;
	int size;
	
	void  workFast(){
		System.out.println(make+model+ " works fast");
	}
	void charge() {
		System.out.println(make+model+ " is charging");
	}
	void ring() {
		System.out.println(make+model+ " ringing very loud");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="S20";
		samsung.color="Blue";
		samsung.memory=256;
		samsung.size=6;
		
		samsung.workFast();
		samsung.charge();
		samsung.ring();
		
		
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="IPhone10";
		iphone.color="white";
		iphone.memory=164;
		iphone.size=6;
		
		iphone.workFast();
		iphone.charge();
		iphone.ring();
	
		
		Phone googlePhone=new Phone();
		googlePhone.make="Google";
		googlePhone.model="Pixel10";
		googlePhone.color="black";
		googlePhone.memory=200;
		googlePhone.size=5;
		
		googlePhone.workFast();
		googlePhone.charge();
		googlePhone.ring();
	
	}
}
	


