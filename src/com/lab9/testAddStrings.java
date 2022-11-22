package com.lab9;

import org.junit.Test;

import static org.junit.Assert.*;

public class testAddStrings extends Object {

    @org.junit.Test
    public void concat() {
        assertEquals("IHeard", JunitTesting.Concat("I", "Heard"));
        assertEquals("ThatYou're", JunitTesting.Concat("That", "You're"));
        assertEquals("HappyWithout", JunitTesting.Concat("Happy", "Without"));
        assertEquals("Me.", JunitTesting.Concat("Me", "."));
    }
}