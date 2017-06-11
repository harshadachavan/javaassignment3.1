package classvardemo;

public class Student {
//class variables are declared with the keyword static
/*
 * Static variables are created when the program starts and destroyed when the program stops.
 * */
	//declaring a class variable
	private static double fees;
	
	//when variables are defined as final their values cannot be changed
	public static final String Subject = "Andriod";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fees = 20000;
	      System.out.println("Subject : " +Subject + "\n Fees : " + fees);
	}

}
