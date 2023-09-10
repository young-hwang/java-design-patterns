package me._23_visitor._00_model;

public interface Element {
    void accept(Visitor visitor);
}
