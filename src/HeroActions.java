import java.util.Random;

public class HeroActions {
    private Random random = new Random();
    
    public void run(Hero hero) {
        int energyCost = random.nextInt(3) + 1;
        int currentEnergy = hero.getEnergy();
        
        if (currentEnergy >= energyCost) {
            hero.setEnergy(currentEnergy - energyCost);
            System.out.printf("%s ran and lost %d energy%n", hero.getName(), energyCost);
        } else {
            System.out.println("Not enough energy to run!");
        }
    }
    
    public void work(Hero hero) {
        int currentEnergy = hero.getEnergy();
        
        if (currentEnergy >= 2) {
            hero.setCoins(hero.getCoins() + 10);
            hero.setEnergy(currentEnergy - 2);
            System.out.printf("%s worked hard: +10 coins, -2 energy%n", hero.getName());
        } else {
            System.out.println("Not enough energy to work!");
        }
    }
    
    public void rest(Hero hero) {
        int currentEnergy = hero.getEnergy();
        int newEnergy = Math.min(currentEnergy + 5, 20);
        hero.setEnergy(newEnergy);
        System.out.printf("%s rested: energy restored to %d%n", hero.getName(), newEnergy);
    }
    
    public void buy(Hero hero, String item, int price) {
        if (hero.getCoins() >= price) {
            hero.setCoins(hero.getCoins() - price);
            hero.addItem(item);
            System.out.printf("%s bought %s for %d coins%n", hero.getName(), item, price);
        } else {
            System.out.println("Not enough coins to buy " + item);
        }
    }
}