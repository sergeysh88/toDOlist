package org.sergejsh.samples.toDOListCore;

import java.util.List;

public interface TasksCatalog {
    //add
    void add(ToDoElement elem);
    //delete
    void delete (ToDoElement elem);
    //get list
    List<ToDoElement> getList ();
}
