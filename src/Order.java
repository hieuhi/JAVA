import java.util.ArrayList;

public class Order {
    private ArrayList<LineItem> lineItems;

    public Order() {
        this.lineItems = new ArrayList<>();
    }


    public Order(String customerName, String transactionTime) {

    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public double cost() {
        double totalCost = 0.0;
        for (LineItem item : lineItems) {
            totalCost += item.cost();
        }
        return totalCost;
    }

    public boolean addProduct(Product product, int quantity) {
        if (quantity <= product.getQuantity()) {
            LineItem item = new LineItem(product, quantity);
            lineItems.add(item);
            product.setQuantity(product.getQuantity() - quantity);
            return true;
        } else {
            return false;
        }
    }
}
