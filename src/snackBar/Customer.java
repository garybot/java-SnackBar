package snackBar;

public class Customer {
	private static int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand) {
		maxId++;

		this.id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void addCashOnHand(double cash) {
		cashOnHand += cash;
	}

	public void buy(Snack item, int quantity) {
		double totalCost = item.getTotalCost(quantity);
		if (totalCost <= cashOnHand) {
			cashOnHand -= totalCost;
			item.addQuantity(-quantity);
		} else {
			System.out.println("You don't have enough monies!");
		}
	}
}