package algorithm;

public class ExpensesTracker {

    private ExpenseNode head;
    private ExpenseNode tail;
    private int size;

    public  ExpensesTracker(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addExpense(String description, double amount){
        ExpenseNode node = new ExpenseNode(description, amount);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public double getTotalExpenses() {
        double total = 0;
        ExpenseNode current = head;
        while (current != null) {
            total += current.amount;
            current = current.next;
        }
        return total;
    }


}
