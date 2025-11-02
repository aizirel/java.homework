public class Shop {
    private String[] items;
    private int[] prices;
    
    public Shop() {
        this.items = new String[]{"Bread", "Potion", "Sword", "Shield", "Potion"};
        this.prices = new int[]{5, 12, 50, 30, 12};
    }
    
    public void printCatalog() {
        System.out.println("=== Shop Catalog ===");
        System.out.println("Index | Item     | Price");
        System.out.println("------+----------+------");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%5d | %-8s | %5d%n", i, items[i], prices[i]);
        }
        System.out.println("====================");
    }
    
    public void sell(Hero hero, int itemIndex) {
        if (itemIndex >= 0 && itemIndex < items.length) {
            String item = items[itemIndex];
            int price = prices[itemIndex];
            
            if (hero.getCoins() >= price) {
                hero.setCoins(hero.getCoins() - price);
                hero.addItem(item);
                System.out.printf("Sold %s to %s for %d coins%n", item, hero.getName(), price);
            } else {
                System.out.println("Not enough coins!");
            }
        } else {
            System.out.println("Invalid item index!");
        }
    }
}