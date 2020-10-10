package BankApplication; 
import java.util.ArrayList; 

class Bank{
	private String name; 
	private ArrayList<Branch> branches = new ArrayList<Branch>();
	
	Bank(String bankName){
		this.name = bankName; 
	}
	
	String getName(){
		return name; 
	}
	
	ArrayList<Branch> getBranches(){
		return branches; 
	}
	
	boolean addNewBranch(String name){
		if(findBranch(name) == -1){
			branches.add(new Branch(name));
			return true; 
		}
		return false; 
	}
	
	private int findBranch(String name){
		for(int i=0; i<branches.size(); i++){
			if(branches.get(i).getName().equals(name)){
				return i; 
			}
		}
		return -1; 
	}
	
	boolean listCustomers(String nameOfBranch){
		int index = findBranch(nameOfBranch); 
		if(index == -1){
			System.out.println("Invalid Branch Name"); 
			return false; 
		}
		Branch branch = branches.get(index); 
		branch.printCustomerDetails(); 
		return true; 
	}
	
	boolean addCustomer(String branchName, String customerName, double initialAmount){
		int index = findBranch(branchName); 
		if (index == -1){
			System.out.println("invalid branch name"); 
			return false;
		}
		branches.get(index).addNewCustomer(customerName, initialAmount); 
		return true;
	}
	
	boolean addTransections(String branchName, String customerName, double amount){
		int index = findBranch(branchName); 
		if(index == -1){
			//System.out.println("Invalid Branch Name"); 
			return false;
		}
		int i = branches.get(index).doesNameExist(customerName);
		if(i == -1){
			System.out.println("Invalid Customer Name");
			return false;
		}
		branches.get(index).getCustomeres().get(i).addTransections(amount); 
		return true;
	}
}