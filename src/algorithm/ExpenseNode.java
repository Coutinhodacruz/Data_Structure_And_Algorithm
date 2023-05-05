package algorithm;

public class ExpenseNode {

    public String description;
    public double amount;
    public ExpenseNode next;

    public ExpenseNode(String description, double amount) {
        this.description = description;
        this.amount = amount;
        this.next = null;
    }
}
