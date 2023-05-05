package algorithm;

public class ExpenseMain {
    public static void main(String[] args) {

        ExpensesTracker tracker = new ExpensesTracker();

        tracker.addExpense("Groceries", 50.00);
        tracker.addExpense("Gas", 30.00);
        tracker.addExpense("Dinner with friends", 80.00);
        double totalExpenses = tracker.getTotalExpenses();
        System.out.println("Total expenses for the month: $" + totalExpenses);
    }
}
