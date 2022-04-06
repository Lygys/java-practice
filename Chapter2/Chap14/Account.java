public class Account {
    String accountNumber;
    int balance;
    
    public Account(String accountNumber, int balance) {
    	this.accountNumber = accountNumber;
    	this.balance = balance;
    }

    
    public String toString() {
    	return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
    }
    public boolean equals(Object o) {
    	if (this == o) {
    		return true;
    	}
    	if (o instanceof Account) {
    		Account a = (Account) o;
    		String an1 = this.accountNumber.trim();
    		String an2 = a.accountNumber.trim();
    		if (an1.equals(an2)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    	Account a = new Account("4649", 1592);
    	System.out.println(a);
    	Account b = new Account(" 4649", 1592);
    	System.out.println(a.equals(b));   	
    }    
}