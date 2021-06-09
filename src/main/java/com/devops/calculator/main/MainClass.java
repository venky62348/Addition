package com.devops.calculator.main;

import java.util.Scanner;
import java.lang.Integer;

import com.devops.calculator.addition.Addition;

// demo: git poll scm test with jenkins

public class MainClass {

	public static void main(String[] args) {
		
		Addition add = new Addition();
		
		System.out.println("\n\tAdding two numbers: "+add.addition(10,100));
		
		int A = Integer.valueOf(args[0]).intValue();
		System.out.print("\nValue of number 'A' is: "+A);
		
		int B = Integer.valueOf(args[1]).intValue();
		System.out.print("\nValue of number 'B' is: "+B);
		
		
		System.out.println("\n\tAdding two numbers A+B is: "+add.addition(A,B));

	}

}
