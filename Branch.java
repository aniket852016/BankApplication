package BankApplication; 
import java.util.ArrayList; 

class Branch{
	private String name; 
	private ArrayList<Customer> customeres = new ArrayList<Customer>(); 
	
	Branch(String branchName){
		this.name = branchName; 
	}
	
	String getName(){
		return name; 
	}
	
	ArrayList<Customer> getCustomeres(){
		return customeres; 
	}
	
	boolean addNewCustomer(String name, double initialAmount){
		if(doesNameExist(name) == -1){
			customeres.add(new Customer(name, initialAmount)); 
			return true; 
		}
		System.out.println("Invalid Customer name"); 
		return false; 
	}
	
	int doesNameExist(String name){
		int index = -1;
		for(int i=0; i<customeres.size(); i++){
			if(customeres.get(i).getName().equals(name)){
				index = i; 
				break; 
			}
		}
		return index;
	}
	
	boolean addTransections(String customerName, double amount){
		int index = doesNameExist(customerName); 
		if(index != -1){
			customeres.get(index).addTransections(amount);
			return true; 
		}
		return false; 
	}
	
	public void printCustomerDetails(){
		int i = 1; 
		for (Customer c: customeres){
			System.out.println(i + ": " + c.getName()); 
			//System.out.println("Trasection of customer are: ");
			i++; 
			
			ArrayList <Double> transections = c.getTransections(); 
			
			for (int j=0; j<transections.size(); j++ ){
				double d = Double.valueOf(transections.get(j)); 
				System.out.println("   " + (j+1) + ": " + d);
			}
		}
	}
	
	
}