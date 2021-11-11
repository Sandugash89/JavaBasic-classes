package com.syntax.class15;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Syntax =new Employee();
		Syntax.empID="1234";
		Syntax.salary=80000;
		Syntax.work();
		System.out.println(Syntax.ceo);
		
		
		Employee Syntax2=new Employee();
		Syntax2.empID="5678";
		Syntax2.salary=15000;
		Syntax2.work();
		System.out.println(Syntax2.ceo);

	}

}
