package com.syntax.class06;

public class WhileLoopIntro {

	public static void main(String[] args) {
	int time =14;
	if (time<17) {
		System.out.println("It is a day");
	} 
	while (time<17) {
		System.out.println("It is a day");
		time++;
	}
	System.out.println("I want to print numbers from 1 to 20 ");
	int i=1;
	while(i<=20) {
		System.out.println(i);
		i++;
	}
	System.out.println();
	System.out.println("I want to print numbers from 50 to 1 ");
	int age=50;
	while(age>=1) {
		System.out.println(age+" ");
		age--;
	}
	System.out.println();
	System.out.println("End of the code");
	}

}
