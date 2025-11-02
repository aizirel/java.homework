import java.util.ArrayList;

// Класс администратора, наследуется от User
public class Admin extends User {
    
    // Конструктор
    public Admin(String username) {
        super(username); // Вызываем конструктор родительского класса
    }
    
    // Переопределяем метод отправки сообщения (Полиморфизм)
    @Override
    public void sendMessage(String message) {
        // Фильтруем сообщение
        String filteredMessage = filterMessage(message);
        
        // Добавляем префикс [ADMIN] к сообщению
        String adminMessage = "[ADMIN] " + filteredMessage;
        
        // Получаем список сообщений и добавляем новое
        getMessages().add(adminMessage);
        System.out.println(getUsername() + " sent: " + adminMessage);
    }
    
    // Переопределяем метод печати сообщений
    @Override
    public void printMessages() {
        System.out.println("\n=== ADMIN Messages from " + getUsername() + " ===");
        ArrayList<String> messages = getMessages();
        
        if (messages.isEmpty()) {
            System.out.println("No admin messages yet.");
        } else {
            for (int i = 0; i < messages.size(); i++) {
                System.out.println((i + 1) + ". " + messages.get(i));
            }
        }
    }
    
    // Дополнительный метод только для администратора
    public void clearAllMessages() {
        getMessages().clear();
        System.out.println(getUsername() + " cleared all messages!");
    }
}