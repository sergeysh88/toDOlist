package org.sergejsh.samples.toDOListCore;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToDoElemSerializerImplTest {

    private ToDoElemSerializer tempelemserializer;

    @Before
    public void beforeEach() {
        tempelemserializer = new ToDoElemSerializerImpl();
    }

    @Test
    public void toFromStrTest() {
        ToDoElement testElem = new ToDoElement(666, "fap", TaskStatus.ACTIVE);
        String tempStr = tempelemserializer.toStr(testElem);
        ToDoElement testStr = tempelemserializer.fromStr(tempStr);

        assertNotNull("object was null!!!!!", testStr);
        assertEquals("they are not eguals", testStr, testElem);
    }

}