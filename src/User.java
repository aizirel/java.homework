import java.util.ArrayList;


public class User {
    private String username;
    private ArrayList<String> messages;
    
    public User(String username) {
        this.username = username;
        this.messages = new ArrayList<>();
    }
    
    public void sendMessage(String message) {
        String filteredMessage = filterMessage(message);
        messages.add(filteredMessage);
        System.out.println(username + " sent: " + filteredMessage);
    }
    
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
    
    public String filterMessage(String message) {
        String[] badWords = {"fuck", "bitch", "shit", "asshole", "damn"};
        
        String filteredMessage = message;
        
        for (String badWord : badWords) {
            String regex = "(?i)\\b" + badWord + "\\b";
            filteredMessage = filteredMessage.replaceAll(regex, "**");
        }
        
        return filteredMessage;
    }
    
    public void analyzeMessage(String message) {
        System.out.println("\n--- Message Analysis: \"" + message + "\" ---");
        
        int length = message.length();
        System.out.println("Length: " + length + " characters");
        
        String[] words = message.split("\\s+"); 
        int wordCount = words.length;
        System.out.println("Word count: " + wordCount);
        
        if (!message.isEmpty()) {
            boolean startsWithCapital = Character.isUpperCase(message.charAt(0));
            System.out.println("Starts with capital letter: " + startsWithCapital);
        } else {
            System.out.println("Starts with capital letter: false (empty message)");
        }
        
        int capitalCount = 0;
        for (char c : message.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }
        System.out.println("Total capital letters: " + capitalCount);
    }
    
    public String getUsername() {
        return username;
    }
    
    public ArrayList<String> getMessages() {
        return messages;
    }
    
    public void analyzeAllMessages() {
        System.out.println("\n=== Analyzing ALL messages from " + username + " ===");
        for (String message : messages) {
            analyzeMessage(message);
        }
    }
}