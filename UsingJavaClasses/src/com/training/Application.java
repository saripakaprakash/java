package com.training;

public class Application {
	
	public static void main(String[] args) {
		
		  LifeInsurance policy = new LifeInsurance(45451,"dddd",500000.00D,"IUY");
		  
		  PolicyHolder holder = new PolicyHolder();
		  
		  InsuranceAgent agent=new InsuranceAgent();
		 
		  double premiumAmount = agent.calculatePremium( policy);
		  
		  String message= holder.paypremium(premiumAmount);
		  
		  System.out.println(message);
	}

}
