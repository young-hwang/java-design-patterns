package io.github.younghwang.gofbasic._23_visitor._02_after;

public interface Device {
    void toPrint(Triangle triangle);

    void toPrint(Rectangle rectangle);
}
