
package com.javaproject;

import java.util.Scanner;

public class Power {
	public static void pow(int base,int power) {
		int result=1;	
		for(int i=1;i<=power;i++) {	
			result=result*base;
		}	
		System.out.println(result);	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int base=sc.nextInt();
		int power=sc.nextInt();
		pow(base,power);
	}
}

