package org.sergejsh.samples.toDOListCore;

public interface ToDoElemSerializer {
    String toStr (ToDoElement element);
    ToDoElement fromStr (String str);
}
