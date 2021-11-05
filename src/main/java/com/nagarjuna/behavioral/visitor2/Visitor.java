package com.nagarjuna.behavioral.visitor2;

public interface Visitor {
    int visit(Pen pen);
    int visit(Notebook notebook);
}