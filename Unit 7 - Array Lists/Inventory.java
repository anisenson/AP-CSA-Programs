import java.util.*;
public class Inventory {

    private ArrayList<Item> inStock;

    public Inventory() {
        inStock = new ArrayList<>();
    }

    public void addItem(Item item) {
        inStock.add(item);
    }

    public void removeItem(String name) {
        for (int x = 0; x < inStock.size(); x++){
            if (inStock.get(x).getName().equals(name)){
                inStock.remove(x);
                x--;
            }
        }
    }

    public void removeItem() {
        for (int x = 0; x < inStock.size(); x++){
            if (inStock.get(x).getQuantity() == 0){
                inStock.remove(x);
                x--;
            }
        }
    }

    public void updatePrice(String name, double percentChange){
        for (int i = 0; i < inStock.size(); i++) {
            if (inStock.get(i).getName().equals(name)) {
                double newPrice = inStock.get(i).getPrice() * (1 + percentChange / 100);
                inStock.get(i).setPrice(newPrice);
            }
        }
    }

    public int largestQuantityIndex(){
        int largest = 0;
        for (int i = 1; i < inStock.size(); i++) {
            if (inStock.get(i).getQuantity() > inStock.get(largest).getQuantity()) {
                largest = i;
            }
        }
        return largest;
    }

    public ArrayList<Item> getInventoryList() {
        return inStock;
    }

}



