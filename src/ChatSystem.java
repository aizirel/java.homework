import java.util.ArrayList;

// Главный класс для тестирования системы чата
public class ChatSystem {
    public static void main(String[] args) {
        System.out.println("=== CHAT MESSAGE FILTERING AND ANALYSIS SYSTEM ===\n");
        
        // Часть 3: Использование ArrayList
        ArrayList<User> users = new ArrayList<>();
        
        // Создаем обычных пользователей и администратора
        User alice = new User("Alice");
        User bob = new User("Bob");
        Admin moderator = new Admin("Moderator");
        
        // Добавляем пользователей в список
        users.add(alice);
        users.add(bob);
        users.add(moderator);
        
        System.out.println("1. SIMULATING CHAT MESSAGES:");
        System.out.println("----------------------------");
        
        // Симулируем чат: пользователи отправляют сообщения
        alice.sendMessage("Hello everyone!");
        bob.sendMessage("This chat is fun but sometimes people say bad words like fuck and shit");
        moderator.sendMessage("Please follow the rules and be respectful");
        
        alice.sendMessage("What's up everyone?");
        bob.sendMessage("I'm feeling good today, bitch! Just kidding :)");
        moderator.sendMessage("No offensive language please!");
        
        alice.sendMessage("Let's keep this chat friendly");
        bob.sendMessage("Okay, sorry about that");
        
        System.out.println("\n2. PRINTING ALL MESSAGES:");
        System.out.println("------------------------");
        
        // Печатаем все сообщения каждого пользователя
        for (User user : users) {
            user.printMessages();
        }
        
        System.out.println("\n3. ANALYZING MESSAGES:");
        System.out.println("---------------------");
        
        // Анализируем все сообщения каждого пользователя
        for (User user : users) {
            user.analyzeAllMessages();
        }
        
        System.out.println("\n4. DEMONSTRATING POLYMORPHISM:");
        System.out.println("----------------------------");
        
        // Демонстрация полиморфизма
        User regularUser = new User("RegularUser");
        User adminUser = new Admin("AdminUser");
        
        // Оба объекта типа User, но ведут себя по-разному
        regularUser.sendMessage("I'm a regular user");
        adminUser.sendMessage("I'm actually an admin");
        
        System.out.println("\n5. TESTING BAD WORD FILTERING:");
        System.out.println("------------------------------");
        
        // Тестируем фильтрацию плохих слов
        User tester = new User("Tester");
        String testMessage = "This is a test: fuck, bitch, shit, asshole and FUCK in uppercase";
        System.out.println("Original: " + testMessage);
        System.out.println("Filtered: " + tester.filterMessage(testMessage));
        
        // Анализ тестового сообщения
        tester.analyzeMessage(testMessage);
    }
}