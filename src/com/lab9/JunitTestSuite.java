package com.lab9;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestAddNumbers.class,
        testAddStrings.class
})
public class JunitTestSuite {}
