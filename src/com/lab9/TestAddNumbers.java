package com.lab9;

import static org.junit.Assert.*;

public class TestAddNumbers extends Object {

    @org.junit.Test
    public void sum() {
        assertEquals(4, JunitTesting.Sum(2, 2));
        assertEquals(0, JunitTesting.Sum(2, -2));
        assertEquals(-4, JunitTesting.Sum(-2, -2));
        assertEquals(1, JunitTesting.Sum(1, 0));
    }
}