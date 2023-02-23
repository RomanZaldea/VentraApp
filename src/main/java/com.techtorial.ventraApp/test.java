package com.techtorial.ventraApp;

import java.util.Arrays;

import static com.techtorial.ventraApp.VentraCard.createCardNumber;

public class test {
    public static void main(String[] args) {
        //createCardNumber();
        VentraCard c=new VentraCard();
        VentraCard d=c.createCard("pwerio", "oeijg", "pwiru" );
        System.out.println(d.getCardNumber());





    }
}
