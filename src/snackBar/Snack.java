package snackBar;

public class Snack {
  private static int maxId = 0;

  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendId;

  public Snack(String name, int quantity, double cost, int vendId) {
    maxId++;
    this.id = maxId;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendId = vendId;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void addQuantity(int amount) {
    this.quantity += amount;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void buy(int amount) {
    quantity -= amount;
  }

  public double getTotalCost(int amount) {
    return cost * amount;
  }
}
