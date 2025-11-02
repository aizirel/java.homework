import java.util.ArrayList;

public class Hero {
    private String name;
    private int coins;
    private int energy;
    private ArrayList<String> inventory;
    
    public Hero(String name, int coins, int energy) {
        this.name = name;
        this.coins = coins;
        this.energy = energy;
        this.inventory = new ArrayList<>();
    }
    
    public void printStatus() {
        System.out.println("=== Hero Status ===");
        System.out.printf("Name: %s | Coins: %d | Energy: %d%n", name, coins, energy);
        System.out.print("Inventory: [");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.print(inventory.get(i));
            if (i < inventory.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("-------------------");
    }
    
    public void addItem(String item) {
        inventory.add(item);
        System.out.println("Added " + item + " to inventory");
    }
    
    public boolean hasItem(String item) {
        return inventory.contains(item);
    }
    
    public String getName() { return name; }
    public int getCoins() { return coins; }
    public int getEnergy() { return energy; }
    public void setCoins(int coins) { this.coins = coins; }
    public void setEnergy(int energy) { this.energy = energy; }
    public ArrayList<String> getInventory() { return inventory; }
}