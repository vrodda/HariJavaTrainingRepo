package oops;

public class AccountDeatils {

	
String	getAcctDetails(String name)
	{
		return "Hi " + name;
	}

String	getAcctDetails(String name,String balance)
{
	return "Hi " + name + " Your account balance is "+balance;
}

String	getAcctDetails(String name,String balance,int status)
{
	
	
	return "Hi " + name + " Your account balance is "+balance+ " Status is "+status;
}


}
