public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Hero Game ===\n");
        
        // Тестирование отдельных упражнений
        System.out.println("1. Testing Budget Planning:");
        BudgetPlanning.main(new String[]{});
        
        System.out.println("\n2. Testing Hero System:");
        Hero alex = new Hero("Alex", 42, 20);
        alex.printStatus();
        
        HeroActions actions = new HeroActions();
        actions.work(alex);
        actions.run(alex);
        actions.rest(alex);
        
        Shop shop = new Shop();
        shop.printCatalog();
        shop.sell(alex, 0);
        
        alex.printStatus();
    }
}