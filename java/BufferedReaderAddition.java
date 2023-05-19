package prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAddition {
public static void main(String[] args) throws NumberFormatException, IOException {
	int a,b,c;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter any two numbers");
	a=Integer.parseInt(reader.readLine());
	b=Integer.parseInt( reader.readLine());
	c=a+b;
	System.out.println("The Addition of " +a+ " And " +b+ " is " +c);
	
}
}
