package com.hajix.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestResourceTest {

    @Test
    public void testStringEcho() {
        assertEquals("test", new TestResource().echo("test"));
    }
    
    @Test
    public void testObjectEcho() {
        ComplexObject co = new ComplexObject();
        co.setKey("key");
        co.setValue(123);
        assertEquals(co, new TestResource().echo(co));
    }
}
