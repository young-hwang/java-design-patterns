package me._23_visitor.gof._00_model;

public interface Element {
    void accept(Visitor visitor);
}
