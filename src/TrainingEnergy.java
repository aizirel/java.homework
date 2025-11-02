import java.util.Random;

public class TrainingEnergy {
    public static void main(String[] args) {
        Random random = new Random();
        int energy = 20;
        int lap = 0;
        
        while (energy > 0) {
            lap++;
            int energyCost = random.nextInt(3) + 1;
            
            if (lap % 5 == 0) {
                energy += 2;
                System.out.printf("Lap %d | Adrenaline boost! +2 energy | ", lap);
            } else {
                System.out.printf("Lap %d | -%d energy | ", lap, energyCost);
            }
            
            energy -= energyCost;
            
            if (energy < 0) {
                energy = 0;
            }
            
            System.out.printf("Energy left: %d%n", energy);
        }
        
        System.out.println("Training completed!");
    }
}