package com.syntax.class09;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {100, 200, 300, 400, 500};
System.out.println(num[1]);
for(int i=0; i<num.length; i++) {
System.out.println(num[i]+ "  ");
	}

for (int n:num) {
	System.out.println(n);
}
}
}