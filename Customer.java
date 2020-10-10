package BankApplication; 
import java.util.ArrayList;

class Customer{
	private String name; 
	private ArrayList<Double> transections = new ArrayList<Double>();
	
	Customer(String name, double amount){
		this.name = name; 
		addTransections(amount);
	}
	
	
	String getName(){
		return name; 
	}
	
	ArrayList<Double> getTransections(){
		return transections; 
	}
	
	boolean addTransections(double amount){
		if(amount>=0){
			Double amnt = Double.valueOf(amount); 
			transections.add(amnt);
			return true; 
		}
		System.out.println("Invalid amount"); 
		return false; 
	}
}