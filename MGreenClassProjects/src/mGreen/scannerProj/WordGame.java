package mGreen.scannerProj;

import java.util.Scanner;

public class WordGame {

	public static void main (String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		int age = Integer.MIN_VALUE;
		String profession = "";
		String petName = "";
		double carPrice = Double.MIN_VALUE;
		
		String scannerDump = "";  //just a dump var for when a new line char remains in scanner after number input 
		
		print("Please input your name to begin:");
		
		while (name.equals("")){
			try{
				name = scanner.nextLine();
			}catch(Exception e){
				scannerDump = scanner.next();
				name = "";
				print("Input not recognized, please try again:");
			}
		}
		
		print("Hi, " + name + ". To continue, I'll need you to enter some information.");
		
		print("What is your age?");
		while (age==Integer.MIN_VALUE){
			try{
				age = scanner.nextInt();
			}catch(Exception e){
				scannerDump = scanner.nextLine();
				age = Integer.MIN_VALUE;
				print("Input not recognized, please try again:");
			}
		}
		
		print("What is your current occupation?");
		while (profession.equals("")){
			try{
				profession = scanner.nextLine();
			}catch(Exception e){
				print("Input not recognized, please try again:");
			}
		}
		profession.toUpperCase();
		
		print("What is the name of your favorite pet?");
		while(petName.equals("")){
			try{
				petName = scanner.nextLine();
			}catch(Exception e){
				print("Input not recognized, please try again:");
			}
		}
		petName.toLowerCase();
		
		print("What was the list price (not including sales tax) of your first car?");
		while(carPrice==Double.MIN_VALUE){
			try{
				carPrice = scanner.nextDouble();
			}catch(Exception e){
				carPrice = Double.MIN_VALUE;
				print("Input not recognized, please try again:");
			}
		}
		
		//print("What is your quest?");
		//print("what is  the air-speed velocity of an unlaiden swallow?");
		//sorry, I had to make those jokes :D
		
		double carCost = carPrice * 1.075;
		
		int wordCount = 59 + wordCount(name) + wordCount(profession) + wordCount(petName) + 2;
		
		print("A Pensacola resident was devastated when their most beloved pet, " + petName + ", died in a vehicular accident.");
		print(name + ", a " + age + " year-old " + profession + " was incredibly disheartened to hear their pet had driven into");
		print("oncoming traffic, totaling the $" + carCost + " vehicle, and ultimately losing their life. In other news,");
		print("'Florida Man' has stuck again, this time murdering his wife with a squirrel. More on that story at 11.");		
		
		scannerDump = "";
		print(scannerDump);					//only necessary to manage eclipse "unused variable" warning.
		print("Word Count: " + wordCount);
		
		scanner.close();
		
	}
	
	public static void print(String in){
		System.out.println(in);
	}
	
	public static int wordCount(String in){
		
		int count = 1;
		
		for(int i = 1; i < in.length(); i++){
			if(in.charAt(i)==' '){
				count++;
			}
		}
		
		return count;
	}
	
}
