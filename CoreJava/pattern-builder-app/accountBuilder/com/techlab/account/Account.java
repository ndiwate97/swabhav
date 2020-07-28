package com.techlab.account;

public class Account {
	

    private long accNo;
    private String accName;
    private double balance;
    private String branch;
    private double interestRate;    
    
	public long getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public String getBranch() {
		return branch;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public static class Builder {
        private long accNo;
        private String accName;
        private double balance;
        private String branch;
        private double interestRate;
        
		public Builder(long accNo) {
            this.accNo = accNo;
        }
        
        public Builder buildAccName(String accName){
            this.accName = accName;
            return this; 
        }
        
        public Builder buildBalance(double balance){
            this.balance = balance;
            return this;
        }
        
        public Builder buildBranch(String branch){
            this.branch = branch;
            return this;
        }
        
        
        public Builder buildInterestRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }
        
        public Account build(){
            
            Account account = new Account();
            account.accNo = this.accNo;
            account.accName = this.accName;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
    }
    
}
