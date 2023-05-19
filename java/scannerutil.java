package basic;

import java.util.Scanner;

public class scannerutil {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any two numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	
	c=a+b;
	System.out.println("Addition of " +a+ " And " +b+ " is : " +c);
	
}
}
