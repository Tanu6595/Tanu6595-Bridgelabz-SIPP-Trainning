package linkedlist;
class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private Item head = null;

    // Add item at beginning
    public void addAtBeginning(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        newItem.next = head;
        head = newItem;
    }

    // Add item at end
    public void addAtEnd(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add item at specific position
    public void addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos <= 1) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        Item newItem = new Item(name, id, qty, price);
        Item temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove item by ID
    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }
        Item current = head, prev = null;
        while (current != null && current.itemId != id) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Item with ID " + id + " not found.");
            return;
        }
        prev.next = current.next;
    }

    // Update quantity by ID
    public void updateQuantity(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID not found.");
    }

    // Search by ID
    public void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID not found.");
    }

    // Search by Name
    public void searchByName(String name) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                printItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item Name not found.");
    }

    // Calculate total inventory value
    public void totalInventoryValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.printf("💰 Total Inventory Value: ₹%.2f\n", total);
    }

    // Display all items
    public void displayInventory() {
        Item temp = head;
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    private void printItem(Item item) {
        System.out.println("📦 Item Name: " + item.itemName + ", ID: " + item.itemId +
                           ", Quantity: " + item.quantity + ", Price: ₹" + item.price);
    }

    // Sort by name or price
    public void sort(String field, boolean ascending) {
        head = mergeSort(head, field, ascending);
    }

    private Item mergeSort(Item head, String field, boolean asc) {
        if (head == null || head.next == null) return head;
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, field, asc);
        Item right = mergeSort(nextOfMiddle, field, asc);

        return sortedMerge(left, right, field, asc);
    }

    private Item sortedMerge(Item a, Item b, String field, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean compare;
        if (field.equals("name")) {
            compare = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                          : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            compare = asc ? a.price <= b.price : a.price > b.price;
        }

        if (compare) {
            a.next = sortedMerge(a.next, b, field, asc);
            return a;
        } else {
            b.next = sortedMerge(a, b.next, field, asc);
            return b;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addAtEnd("Monitor", 101, 5, 15000.00);
        inv.addAtBeginning("Mouse", 102, 10, 500.00);
        inv.addAtEnd("Keyboard", 103, 7, 1200.00);
        inv.addAtPosition(2, "Laptop", 104, 3, 60000.00);

        System.out.println(" All Inventory Items:");
        inv.displayInventory();

        System.out.println("Search by ID:");
        inv.searchById(104);

        System.out.println("Search by Name:");
        inv.searchByName("keyboard");

        System.out.println("Total Inventory Value:");
        inv.totalInventoryValue();

        System.out.println("Sorting by Price Descending:");
        inv.sort("price", false);
        inv.displayInventory();

        System.out.println("Update Quantity of ID 103:");
        inv.updateQuantity(103, 12);
        inv.displayInventory();

        System.out.println("Remove Item ID 102:");
        inv.removeById(102);
        inv.displayInventory();
    }
}
 
