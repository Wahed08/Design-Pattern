package com.example.state;

public class StatePatternDemo {

    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        try{
            System.out.println(context.getState().toString());
        }catch (Exception e){
            System.out.println("Exception");
        }


        EndState stopState = new EndState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
