import java.time.LocalDate;

public class Expense {
  private String name;
  private double amount;
  private LocalDate date;

  public Expense(String name, double amount, LocalDate date) {
    this.name = name;
    this.amount = amount;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public double getAmount() {
    return amount;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Expense{" +
        "name='" + name + '\'' +
        ", amount=" + amount +
        ", date=" + date +
        '}';
  }

}