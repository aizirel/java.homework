import java.util.ArrayList;

public class Admin extends User {
    
    public Admin(String username) {
        super(username); 
    }
    
    @Override
    public void sendMessage(String message) {
        String filteredMessage = filterMessage(message);
      
        String adminMessage = "[ADMIN] " + filteredMessage;
        
        getMessages().add(adminMessage);
        System.out.println(getUsername() + " sent: " + adminMessage);
    }
   
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
    
    public void clearAllMessages() {
        getMessages().clear();
        System.out.println(getUsername() + " cleared all messages!");
    }
}