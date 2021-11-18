package org.sergejsh.samples.toDOListCore;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TasksCatalog tasksCatalog = new TasksCatalogInMemoryImpl();
        //tasksCatalog.add(new ToDoElement(1, "wake up", TaskStatus.DONE));
        //tasksCatalog.add(new ToDoElement(2, "fap", TaskStatus.ACTIVE));

        while (true) {
            DataInputStream in = new DataInputStream(System.in);
            try {
                System.out.println("Введите команду");
                String line = in.readLine();
                if ("exit".equals(line)) {
                    System.out.println("мы уходим, до свидания!");
                    break;
                }
                if ("get_all".equals(line)) {
                    for (ToDoElement i : tasksCatalog.getList())
                        System.out.println(i);
                }
                if ("append".equals(line)) {
                    tasksCatalog.add(new ToDoElement("wake up", TaskStatus.ACTIVE));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
