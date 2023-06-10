package io.younghwang.basemodel._08_composite._02_after;

public class Client {
    public static void main(String[] args) {
        Item sword = new Item("검", 50);
        Item potion = new Item("빨강물약", 30);

        Bag bag = new Bag();
        bag.add(sword);
        bag.add(potion);

        Client client = new Client();
        client.printPrice(sword);
        client.printPrice(bag);

    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
