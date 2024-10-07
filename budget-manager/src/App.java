import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le gestionnaire de Budget");

        // Ajouter plusieurs dépenses
        Expense expense1 = new Expense("Achat de nourriture", 50, LocalDate.of(2021, 1, 1));
        Expense expense2 = new Expense("Achat de vêtements", 100, LocalDate.of(2021, 1, 2));
        Expense expense3 = new Expense("Achat de livres", 30, LocalDate.of(2021, 1, 3));

        BudgetManager budgetManager = new BudgetManager();
        budgetManager.addExpense(expense1);
        budgetManager.addExpense(expense2);
        budgetManager.addExpense(expense3);

        // Afficher le résumé des dépenses
        budgetManager.displayExpensesSummary();
    }
}
