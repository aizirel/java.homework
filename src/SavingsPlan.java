public class SavingsPlan {
    public static void main(String[] args) {
        int targetCoins = 50;
        int monthlyIncome = 7;
        int totalCoins = 0;
        int month = 0;
        
        System.out.println("Month | Coins total");
        System.out.println("------+-----------");
        
        while (totalCoins < targetCoins) {
            month++;
            totalCoins += monthlyIncome;
            
            if (month % 4 == 0) {
                totalCoins += 10;
            }
            
            System.out.printf("%5d | %11d%n", month, totalCoins);
        }
        
        System.out.printf("Required %d months to buy the sword%n", month);
    }
}