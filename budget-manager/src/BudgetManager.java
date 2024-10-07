import java.util.ArrayList;
import java.util.List;

public class BudgetManager {
  private List<Expense> expenses = new ArrayList<>();
  private double balance = 0;

  public void addExpense(Expense expense) {
    expenses.add(expense);
    balance -= expense.getAmount();
  }

  public void removeExpense(Expense expense) {
    expenses.remove(expense);
    balance += expense.getAmount();
  }

  public List<Expense> getExpenses() {
    return expenses;
  }

  public double getBalance() {
    return balance;
  }

  public void setExpenses(List<Expense> expenses) {
    this.expenses = expenses;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getTotalExpenses() {
    double total = 0;
    for (Expense expense : expenses) {
      total += expense.getAmount();
    }
    return total;
  }

  public void displayExpensesSummary() {
    System.out.println("Résumé des dépenses :");
    for (Expense expense : expenses) {
      System.out.println(
          "Nom : " + expense.getName() + ", Montant : " + expense.getAmount() + ", Date : " + expense.getDate());
    }
    System.out.println("Total des dépenses : " + getTotalExpenses());
    System.out.println("Solde restant : " + getBalance());
  }
}