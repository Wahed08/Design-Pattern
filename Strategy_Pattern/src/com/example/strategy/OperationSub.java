package com.example.strategy;

public class OperationSub implements Strategy{

    @Override
    public int doOperation(int number1, int number2) {
        return number1 - number2;
    }
}
