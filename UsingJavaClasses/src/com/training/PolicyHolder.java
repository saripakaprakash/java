package com.training;

public class PolicyHolder {
	
	private String policyHoldername;
	private String nominee;
	
	
	
	public PolicyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PolicyHolder(String policyHoldername, String nominee) {
		super();
		this.policyHoldername = policyHoldername;
		this.nominee = nominee;
	}
	public String getPolicyHoldername() {
		return policyHoldername;
	}
	public void setPolicyHoldername(String policyHoldername) {
		this.policyHoldername = policyHoldername;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	public String paypremium(double premiumamount){
		
		return premiumamount + ":=paid by cash";
	}
	
	
	
}
