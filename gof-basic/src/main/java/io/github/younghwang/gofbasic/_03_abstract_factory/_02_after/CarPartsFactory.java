package io.github.younghwang.gofbasic._03_abstract_factory._02_after;

public interface CarPartsFactory {
    Wheel createWheel();

    Engine createEngine();
}
