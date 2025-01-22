package me._02_factory_method.java.printer._03_after;

/**
 * Client 인스턴스 생성 시 Printer 하위 클래스의 인스턴스를 넘김
 * 의존성 주입(Dependency Injection)
 */
public class Main {
    public static void main(String[] args) {
        new Client(new DigitPrinter()).execute();
        new Client(new GraphPrinter()).execute();
    }
}
