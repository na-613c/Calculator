package com.example.calculator;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;

public class DataCalculation {

    public BigDecimal calc(String str) {
        str = str.replace("√", "sqrt");
        Expression expression = new Expression(str);
        return expression.eval();
    }

}
