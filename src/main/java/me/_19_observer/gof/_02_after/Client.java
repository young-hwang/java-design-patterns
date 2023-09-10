package me._19_observer.gof._02_after;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("young");
        User user2 = new User("hwang");

        chatServer.register("design pattern", user1);
        chatServer.register("design pattern", user2);

        chatServer.register("game", user1);

        chatServer.sendMessage(user1, "design pattern", "this is observer patther");
        chatServer.sendMessage(user1, "design pattern", "view code");

        chatServer.sendMessage(user1, "game", "game is life");
    }
}
