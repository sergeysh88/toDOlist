package org.sergejsh.samples.toDOListCore;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TasksCatalog tasksCatalog = new TasksCatalogInMemoryImpl();
        tasksCatalog.add(new ToDoElement(1, "wake up", TaskStatus.DONE));
        tasksCatalog.add(new ToDoElement(2, "fap", TaskStatus.ACTIVE));
        for (ToDoElement i : tasksCatalog.getList())
            System.out.println(i);
    }
}
