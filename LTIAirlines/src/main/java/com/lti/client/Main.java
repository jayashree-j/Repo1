package com.lti.client;

import com.lti.model.Flight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight f=new Flight(1001,"chennai","bangalore");
		System.out.println(f.getFlightId()+" "+f.getSource()+" "+f.getDestination());
		
		int n1=10,n2=20;
		if(add(n1,n2)==30)
			System.out.println("test passed");
		else
			System.out.println("test failed");
	}
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static boolean compare(int n1,int n2) {
		if(n1==n2)
			return true;
		return false;
	}
	
}
