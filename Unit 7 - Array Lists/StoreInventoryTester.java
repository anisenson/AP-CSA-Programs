import java.util.*;

public class StoreInventoryTester {
    public static void main(String[] args) {
        Inventory storeInventory = new Inventory();

        storeInventory.addItem(new Item("Apple", 1.50, 50));
        storeInventory.addItem(new Item("Banana", 0.75, 100));
        storeInventory.addItem(new Item("Orange", 1.25, 0));
        storeInventory.addItem(new Item("Milk", 3.99, 25));
        storeInventory.addItem(new Item("Bread", 2.49, 30));
        storeInventory.addItem(new Item("Eggs", 4.99, 60));
        storeInventory.addItem(new Item("Cheese", 5.49, 15));
        storeInventory.addItem(new Item("Chicken", 7.99, 20));
        storeInventory.addItem(new Item("Rice", 2.99, 0));
        storeInventory.addItem(new Item("Pasta", 1.99, 0));




        storeInventory.removeItem("Orange");
        storeInventory.removeItem();
        storeInventory.updatePrice("Eggs", 150);
        storeInventory.largestQuantityIndex();
        System.out.println(storeInventory.getInventoryList());

    }
}