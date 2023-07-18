package io.github.younghwang.gofbasic._08_composite._01_before;

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

    private void printPrice(Bag bag) {
//        Integer reduce = bag.getItems().stream().map(Item::getPrice).reduce(0, (a, b) -> a + b);
        Integer reduce = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(reduce);
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }
}
