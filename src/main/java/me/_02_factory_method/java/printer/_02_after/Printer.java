package me._02_factory_method.java.printer._02_after;

/**
 * Printer 클래스에 create라는 팩토리 메서드를 만들어 Client의 DigitPrinter, GraphPrinter 의존 제거
 */
public abstract class Printer {
    public abstract void print(int n);

    public static Printer create(boolean graphical) {
        if (graphical) {
            return new GraphPrinter();
        } else {
            return new DigitPrinter();
        }
    }
}
