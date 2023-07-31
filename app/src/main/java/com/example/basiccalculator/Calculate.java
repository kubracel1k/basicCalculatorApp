package com.example.basiccalculator;

public class Calculate {
    private  int incomingNumber1, incomingNumber2;

    public Calculate(int incomingNumber1, int incomingNumber2) {
        this.incomingNumber1 = incomingNumber1;
        this.incomingNumber2 = incomingNumber2;
    }
    public int point(){
       return incomingNumber1 + incomingNumber2;
    }
    public  int negative(){
        return incomingNumber1 - incomingNumber2;
    }
    public int star(){
        return incomingNumber1 * incomingNumber2;
    }
    public int division(){
        return incomingNumber1 / incomingNumber2;
    }
}
