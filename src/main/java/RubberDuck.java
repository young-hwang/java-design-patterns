public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Sound is Rubber Duck");
    }

    @Override
    public void display() {
        System.out.println("Look like Rubber Duck");
    }
}
