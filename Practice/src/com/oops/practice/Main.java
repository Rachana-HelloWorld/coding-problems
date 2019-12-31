package com.oops.practice;

public class Main {
	
	public static void main(String[] args) {
		
		Sim sim = new Airtel();
		sim.calling();
		
		Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();
		
		Sim sim1 = (Sim) airtel;
		System.out.println(sim1.simNumber);
	}

}
