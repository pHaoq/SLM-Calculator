package com.example.slmcalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    private CalculatorController calculatorController = new CalculatorController();


    @Test
    public void sumTest1(){
        int a = 6;
        int b = 11;
        int resrult = calculatorController.sum(6,11);
        assertEquals(17,resrult);
    }
    @Test
    public void sumTest2(){
        int [] test = {1,2,3,4};
        int [] answer = {3,5,7};
        for (int i = 0; i < test.length-1; i++) {
            assertEquals(answer[i],calculatorController.sum(test[i],test[i+1]));
        }
    }
}