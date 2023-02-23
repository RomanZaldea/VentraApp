package com.techtorial.ventraApp;

import java.util.Random;
import java.util.Scanner;

public class VentraCard {

    /*
    1- Create private instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */
 private String fullName;
 private String phoneNumber;
 private String email;
 private long cardNumber;

    public VentraCard(String fullName, String phoneNumber, String email, long cardNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.cardNumber = cardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public VentraCard() {

    }

    public VentraCard createCard(String fullName, String phoneNumber, String email){

    /*
    this method needs to return VentraCard according to the parameter
     */

        long cardNumber1=createCardNumber();
        VentraCard card=new VentraCard(fullName,phoneNumber,email,cardNumber1);





        return card;
    }

    public static long createCardNumber(){
        /*
        this method needs to return the 16 digit card number
         */
        String randomNum="";
        long randomNumLong=0;
        for (int i = 0; i <16; i++) {
            Random random = new Random();
            int x = random.nextInt(9);

            randomNum=randomNum+x;
            randomNumLong=Long.parseLong(randomNum);
        }
        return randomNumLong;
    }


}
