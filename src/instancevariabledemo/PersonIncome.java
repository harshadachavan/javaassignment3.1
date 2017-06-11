package instancevariabledemo;

public class PersonIncome {
/*
 * The scope of instance variables is determined by the access specifier that is applied to these variables. 
 * */
	// name and age instance variable is visible for any child class.
	   public String name;
	   
	   public int age;
	   
	// income  variable is visible in PersonIncome class only.
	   private int income;
	   
	//creating constructor for class
	   public PersonIncome (String name,int age) {
		      this.name = name;
		      this.age = age;
		   }
	   //adding setter method because modifier used is private and cannot access the
	   //variable outside the class without it
	   
	   public void setIncome(int inc) {
		   income = inc;
		   }
	   
	   public void printPersonDetails() {
		      System.out.println("name  : " + name );
		      System.out.println("age : " + age);
		      System.out.println("income : " + income);
		   }
}
