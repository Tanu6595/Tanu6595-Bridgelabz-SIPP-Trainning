package level2;
public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int count) {
        quantity += count;
    }

    public void removeItem(int count) {
        quantity = Math.max(0, quantity - count);
    }

    public void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Pen", 10, 2);
        cart.addItem(3);
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}
 
