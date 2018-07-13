package com.service.wxtest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestWxtest {

        WxtestDelegate wxtestDelegate = new WxtestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = wxtestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}