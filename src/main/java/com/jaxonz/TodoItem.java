package com.jaxonz;

public class TodoItem {
    public String name;
    public boolean hasDone;

    public TodoItem(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return "name='" + name + (hasDone ? " done" : " need todo");
    }
}
