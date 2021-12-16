package org.sergejsh.samples.toDOListCore;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TasksCatalogInFile implements TasksCatalog {
    private final String filename;

    public TasksCatalogInFile(String n) {
        filename = n;
    }

    @Override
    public void add(ToDoElement elem) {
        ArrayList<ToDoElement> temp = new ArrayList<>(getList());
        temp.add(elem);
        try (
                OutputStream fisCloseable = new FileOutputStream(filename);
                ObjectOutputStream resource = new ObjectOutputStream(fisCloseable)
        ) {
            resource.writeObject(temp);
        } catch (IOException r) {
            throw new RuntimeException(r);
        }
    }

    @Override
    public void delete(ToDoElement elem) {
    }

    @Override
    public List<ToDoElement> getList() {

        if (new File(filename).exists())
            try (
                    InputStream fisCloseable = new FileInputStream(filename);
                    ObjectInputStream resource = new ObjectInputStream(fisCloseable)

            ) {
                return (List<ToDoElement>) resource.readObject();
            } catch (IOException | ClassNotFoundException r) {
                throw new RuntimeException(r);
            }
        return Collections.emptyList();
    }


}
