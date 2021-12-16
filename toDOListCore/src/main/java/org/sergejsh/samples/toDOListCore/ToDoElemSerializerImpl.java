package org.sergejsh.samples.toDOListCore;

public class ToDoElemSerializerImpl implements ToDoElemSerializer {
    @Override
    public String toStr(ToDoElement element) {
        StringBuilder sb = new StringBuilder();
        sb.append(element.getId()).append("|")
                .append(element.getStatus()).append("|")
                .append(element.getDescription());
        return sb.toString();
//        return String.format("%s|%s|%s", element.getId(), element.getStatus(), element.getDescription());
    }

    @Override
    public ToDoElement fromStr(String str) {
        String [] splitResult = str.split("\\|");
        Integer id = Integer.valueOf(splitResult[0]);
        TaskStatus status = TaskStatus.valueOf(splitResult[1]);
        String descrp = splitResult[2];


        return new ToDoElement(id,descrp,status);
    }
}
