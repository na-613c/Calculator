package com.example.calculator;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;

class DataCalculation {

    BigDecimal calc(String str) throws Expression.ExpressionException, ArithmeticException {
        str = str.replace("√", "sqrt");
        Expression expression = new Expression(str);
        return expression.eval();
    }

}
