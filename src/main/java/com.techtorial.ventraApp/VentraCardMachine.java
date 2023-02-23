package com.techtorial.ventraApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VentraCardMachine {

    private String location;
    private ArrayList<VentraCard> allCards;

    public VentraCardMachine(String location){
        this.location=location;
        this.allCards=new ArrayList<VentraCard>();
    }


    public boolean addCard(VentraCard card){
        /*
         This method is taking the parameter as a VentraCard.
         if this VentraCard is not registered before this method will add the VentraCard to the allCards(ArrayList).
         Using VentraCard cardNumber you can verify that the card is in allCards or not
         */


        card=card.createCard(card.getFullName(), card.getPhoneNumber(),card.getEmail());
        for (VentraCard card2:allCards){
            if (card2!=card){
                allCards.add(card);
            }
        }








        return false;
    }

    public void printCardNumbers(ArrayList <VentraCard> cards){

        /*
         This method is taking one parameter as a list of cards and it will print all the card number
         which is available in this list
         */

        for (VentraCard card:allCards){
            System.out.println(card);
        }




    }

    public boolean updateCard(long oldCardNumber, VentraCard newCard){

        /*
        This method is taking two parameter oldCardNumber and it will replace this card with newCard.
        */
        boolean res=false;
        for (int i = 0; i < allCards.size() ; i++) {
            if(allCards.get(i).getCardNumber()==oldCardNumber){
                allCards.set(i,newCard);
                res=true;
            }
        }



        return res;
    }


    public static void userInfo(){
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName1=scanner1.nextLine();

        System.out.println("Please enter phone number");
        String phoneNumber1=scanner1.nextLine();

        System.out.println("Please enter email");
        String email1=scanner1.nextLine();

        VentraCard card8=new VentraCard();
        card8.setFullName(fullName1);
        card8.setPhoneNumber(phoneNumber1);
        card8.setEmail(email1);
        System.out.println(card8.getFullName());
        System.out.println(card8.getPhoneNumber());
        System.out.println(card8.getEmail());
    }




    /*
        1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take three parameter as a cardNumber, oldEmail and newEmail. This method will replace old email address with
        new email address matching with cardNumber
        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number if matching.
        If the card removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.
        5- Create the method will take two parameter as an oldCardNumber and newCardNumber.
        This method will update the old card number with new card number
     */
}
