import java.util.ArrayList;

// Базовый класс пользователя
public class User {
    // Поля класса
    private String username;
    private ArrayList<String> messages;
    
    // Конструктор
    public User(String username) {
        this.username = username;
        this.messages = new ArrayList<>();
    }
    
    // Метод для отправки сообщения
    public void sendMessage(String message) {
        // Фильтруем сообщение от плохих слов перед сохранением
        String filteredMessage = filterMessage(message);
        messages.add(filteredMessage);
        System.out.println(username + " sent: " + filteredMessage);
    }
    
    // Метод для печати всех сообщений пользователя
    public void printMessages() {
        System.out.println("\n=== Messages from " + username + " ===");
        if (messages.isEmpty()) {
            System.out.println("No messages yet.");
        } else {
            for (int i = 0; i < messages.size(); i++) {
                System.out.println((i + 1) + ". " + messages.get(i));
            }
        }
    }
    
    // Метод для фильтрации плохих слов с использованием Regex
    public String filterMessage(String message) {
        // Массив плохих слов для фильтрации
        String[] badWords = {"fuck", "bitch", "shit", "asshole", "damn"};
        
        String filteredMessage = message;
        
        // Заменяем каждое плохое слово на **
        for (String badWord : badWords) {
            // Regex: \\b - граница слова, (?i) - игнорирование регистра
            String regex = "(?i)\\b" + badWord + "\\b";
            filteredMessage = filteredMessage.replaceAll(regex, "**");
        }
        
        return filteredMessage;
    }
    
    // Метод для анализа сообщения
    public void analyzeMessage(String message) {
        System.out.println("\n--- Message Analysis: \"" + message + "\" ---");
        
        // 1. Длина сообщения
        int length = message.length();
        System.out.println("Length: " + length + " characters");
        
        // 2. Количество слов
        String[] words = message.split("\\s+"); // Разделяем по пробелам
        int wordCount = words.length;
        System.out.println("Word count: " + wordCount);
        
        // 3. Проверка на заглавную букву в начале
        if (!message.isEmpty()) {
            boolean startsWithCapital = Character.isUpperCase(message.charAt(0));
            System.out.println("Starts with capital letter: " + startsWithCapital);
        } else {
            System.out.println("Starts with capital letter: false (empty message)");
        }
        
        // 4. Дополнительный анализ: количество заглавных букв
        int capitalCount = 0;
        for (char c : message.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }
        System.out.println("Total capital letters: " + capitalCount);
    }
    
    // Геттеры
    public String getUsername() {
        return username;
    }
    
    public ArrayList<String> getMessages() {
        return messages;
    }
    
    // Метод для анализа всех сообщений пользователя
    public void analyzeAllMessages() {
        System.out.println("\n=== Analyzing ALL messages from " + username + " ===");
        for (String message : messages) {
            analyzeMessage(message);
        }
    }
}