package java07_Oops.com.one.Oops;

public class Client {
	public static void main(String[] args) {
		
		UserImpl userImpl=new UserImpl();
		userImpl.userOrderedDetails(5254,"Nokia");
		userImpl.userDetails("saqlain anish minz", "saqlainthestunter212@gmail.com");
		userImpl.userBankDetails("Bank of India", 60000);
	}

}
