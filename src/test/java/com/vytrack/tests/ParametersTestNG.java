package com.vytrack.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestNG {

    @Parameters("tea")
    @Test
    public void test(String name){

        System.out.println("This is "+name);
    }
}
