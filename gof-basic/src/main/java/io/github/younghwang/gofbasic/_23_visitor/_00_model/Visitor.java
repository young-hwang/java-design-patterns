package io.github.younghwang.gofbasic._23_visitor._00_model;

public interface Visitor {
    void visit(ElementA elementA);

    void visit(ElementB elementB);
}