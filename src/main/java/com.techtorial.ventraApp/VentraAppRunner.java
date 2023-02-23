package com.techtorial.ventraApp;

import java.util.ArrayList;
import java.util.Scanner;

import static com.techtorial.ventraApp.VentraCard.createCardNumber;
import static com.techtorial.ventraApp.VentraCardMachine.userInfo;

public class VentraAppRunner {

    VentraCardMachine machine = new VentraCardMachine("Chicago");

    public static void main(String[] args){
        welcome();
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        /*
        implement the choice logic
         */
        do {
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));


    }

    private static void makeAChoice(String choice){
        VentraCardMachine machine =new VentraCardMachine("Houston");
        VentraCard card=new VentraCard();
        switch (choice){
            case "0":
                System.out.println("Thank you for working with us");
                break;
            case "1":
                /*
                1- Using scanner get the information of User (FullName, PhoneNumber, Email)
                2- Create new card According to this information(Call createCard method)
                3- Call addCard method from VentraCard Machine and add new card
                 */



                break;
            case "2":
                break;
            case "3":
            case "4":
            case "5":
            case "6":

        }
    }

    public static void welcome(){

        System.out.println("Welcome to the Ventra card");
    }

    public static void printOptions(){

        System.out.println("Hello. Please choose one of the following options");
        System.out.println("1 - For new card");
        System.out.println("2 - To print all card holders name and card number");
        System.out.println("3 - To print ventra card numbers");
        System.out.println("4 - To update the Ventra Card  with New Card");
        System.out.println("5 - To update the card number");
        System.out.println("6 - To update existing card email address");
        System.out.println("7 - To search the card with phone number and print all card information");
        System.out.println("8 - To print available options");
        System.out.println("0 - To exit");
    }
}
