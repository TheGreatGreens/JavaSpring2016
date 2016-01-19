package mGreen.classProjects;
import java.util.Scanner;

public class FirstWorkshop {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
			
		println("Hello, Matt Green.");
		println("Welcome to Java.");
		println("");
	
	    println("Let's demonstrate a simple calculation.");
	    println("Please input a number to find its square root:");
	    
	    double inputDbl = Double.MIN_VALUE;
	    String scannerDump;
	    
	    while (inputDbl == Double.MIN_VALUE){
		    try{
		    	inputDbl = scanner.nextDouble(); 
		    }catch(Exception e){
		    	System.err.println("Input invalid, please try again");
		    	scannerDump = scanner.next();
		    }
	    }
	    
	    double answer = Math.sqrt(inputDbl);
	    println("The square root of " + inputDbl +  " is " + answer);
	    
	    scannerDump = "";
	    println(scannerDump);
	
	    scanner.close();
	}
	
	public static void println(String input){
		System.out.println(input);
	}
	
}
