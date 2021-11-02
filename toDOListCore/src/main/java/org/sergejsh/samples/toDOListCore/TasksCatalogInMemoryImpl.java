package org.sergejsh.samples.toDOListCore;

import java.util.ArrayList;
import java.util.List;

public class TasksCatalogInMemoryImpl implements TasksCatalog {
    private List<ToDoElement> memory = new ArrayList<>();

    //add
    public void add(ToDoElement elem) {
        memory.add(elem);
    }

    //delete
    public void delete(ToDoElement elem) {
        memory.remove(elem);
    }

    //get list
    public List<ToDoElement> getList() {
        return memory;
    }
}
