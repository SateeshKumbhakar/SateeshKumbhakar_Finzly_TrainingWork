package oopsCodding.finalAndConstructor;

public class FinalAndConstructor {
	
	public FinalAndConstructor() {
		System.out.println("You are using free version, please upgrade...");
	}
	
	public FinalAndConstructor(Transaction transaction) {
		
		if(transaction!=null) {
			System.out.println( " Your product key is => "+transaction.productKey +"\n Enjoy you plan...");
		}
		else {
			System.out.println("transaction is not done yet first activate product key");
		}
	}
	
	public static void main(String[] args) {
		
//		FinalAndConstructor f1 = new FinalAndConstructor();
		
//		FinalAndConstructor f12 = new FinalAndConstructor(null);
		
		
		Transaction transaction = new Transaction();
		FinalAndConstructor f12 = new FinalAndConstructor(transaction);
		
		
		
	}

}
