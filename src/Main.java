
public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("F523", "Tomato", "Food", 1.5, 589);
        products[1] = new Product("A723", "Kitchen table", "Household", 129.0, 90);
        products[2] = new Product("H370", "Zara shirt", "Apparel", 29.99, 3);
        products[3] = new Product("E092", "iPhone", "Electronic", 100, 0);

        for (Product product : products) {
            System.err.println(product);
        }
    }
}