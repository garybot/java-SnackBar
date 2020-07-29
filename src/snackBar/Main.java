package snackBar;

public class Main {
  public static void main(String[] args) {
  	System.out.println("Hello World!");

  	Customer c1 = new Customer("Jane", 45.25);
  	Customer c2 = new Customer("Bob", 33.14);

  	VendingMachine v1 = new VendingMachine("Food");
  	VendingMachine v2 = new VendingMachine("Drink");
  	VendingMachine v3 = new VendingMachine("Office");

  	Snack s1 = new Snack("Chips", 36, 1.75, 1);
  	Snack s2 = new Snack("Chocolate Bar", 36, 1.0, 1);
  	Snack s3 = new Snack("Pretzel", 30, 2.0, 1);
  	Snack s4 = new Snack("Soda", 24, 2.5, 2);
  	Snack s5 = new Snack("Water", 20, 2.75, 2);

  	c1.buy(s4, 3);
  	System.out.println("Customer 1 cash on hand $" + c1.getCashOnHand());
  	System.out.println("Quantity of snack 4 is " + s4.getQuantity());

  	c1.buy(s3, 1);
  	System.out.println("Customer 1 cash on hand $" + c1.getCashOnHand());
  	System.out.println("Quantity of snack 3 is " + s3.getQuantity());

  	c2.buy(s4, 2);
  	System.out.println("Customer 2 cash on hand $" + c2.getCashOnHand());
  	System.out.println("Quantity of snack 4 is " + s4.getQuantity());

  	c1.addCashOnHand(10.0);
  	System.out.println("Customer 1 cash on hand $" + c1.getCashOnHand());
	
	c1.buy(s2, 1);
  	System.out.println("Customer 1 cash on hand $" + c1.getCashOnHand());
  	System.out.println("Quantity of snack 2 is " + s2.getQuantity());

  	s3.addQuantity(12);
  	System.out.println("Quantity of snack 3 is " + s3.getQuantity());

  	c2.buy(s3, 3);
  	System.out.println("Customer 2 cash on hand $" + c2.getCashOnHand());
  	System.out.println("Quantity of snack 3 is " + s3.getQuantity());


  }
}
