package com.Mukesh;
import java.util.ArrayList;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		//Retrieving
		System.out.println(numbers.get(0));
		System.out.println("\nIteration #1: ");

		//Indexed for loop iteration
		for(int i=0; i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}

	}

}
