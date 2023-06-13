package com.example.slmcalc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    /**
     *
     * added function
     * @return
     */

@RequestMapping("/calc/sum") //beispiel http://localhost:8080/calc/sum?a=5&b=4
public int sum (
                @RequestParam int a,
                @RequestParam int b
)
{
    return a + b +b;
}


}
