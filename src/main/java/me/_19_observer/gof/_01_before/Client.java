package me._19_observer.gof._01_before;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);
        user1.sendMessage("design pattern", "this is observer patther");
        user1.sendMessage("game", "is life");

        User user2 = new User(chatServer);
        System.out.println(user2.getMessage("design pattern"));

        user1.sendMessage("design pattern", "view code");
        System.out.println(user2.getMessage("design pattern"));
    }
}
