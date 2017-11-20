package com.smile.mohamed.simpleunittest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by COMPUMAGIC on 20/11/2017.
 */
public class TestClassTest {
    @Test
    public void addWithTwoNumberThenReturnAsFifteen() throws Exception {
        int input1=10;
        int input2=5;
        int excepected=15;
        TestClass aClass=new TestClass();
        int output=aClass.Add(input1,input2);
        assertEquals(excepected,output);
    }

    @Test
    public void subTwoNumberThenReturnResultAsFive() throws Exception {
        int input1=10;
        int input2=5;
        int excepected=5;
        TestClass aClass=new TestClass();
        int output=aClass.Sub(input1,input2);
        assertEquals(excepected,output);
    }

}