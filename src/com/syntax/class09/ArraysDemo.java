package com.syntax.class09;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10;
System.out.println(num);
int[] array=new int [4];
array[0]=12;
array[1]=10;
array[2]=13;
array[3]=14;
System.out.println(array[2]);

String[] colors=new String[4];
colors[0]="Red";
colors[1]="Blue";
colors[2]="Black";
colors[3]="Yellow";
// colors[4]="Green"; ArrayIndexOutOfBoundsException

//System.out.println(colors[4]);ArrayIndexOutOfBoundsException

//see how many elements inside array

System.out.println("Size of array is"+colors.length);
	}

}
