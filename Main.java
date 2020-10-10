package BankApplication;  

class Main{
	
	public static void main(String [] args){
		Bank RBI = new Bank("Researve bank of India");
		//RBI.addTransections("RBI Delhi", "Aniket", 50.3); 
		
		RBI.addNewBranch("RBI Delhi"); 
		//RBI.addTransections("RBI Delhi", "Aniket", 50.3); 
		
		//RBI.addTransections("PNB Pune", "Aniket", 50.3); 
		
		RBI.addCustomer("RBI Delhi", "Vishal", 10.0);
		RBI.addTransections("RBI Delhi", "Aniket", 50.3);
		//RBI.addCustomer("RBI Delhi", "Aniket", 10.0);
		//RBI.addTransections("RBI Delhi", "Aniket", -5);
		//RBI.addCustomer("RBI Delhi", "Aniket", 10.0);
		//RBI.addCustomer("SBI Kolkata", "Aniket", 5.5);
		
		RBI.listCustomers("RBI Delhi"); 
	}
	
}