package com.company;


import java.util.Scanner;
import java.util.Vector;

class SECURITY{
    String sec_db[][] = new String[][];


    void add_details(String shop){
        while(true) {
            System.out.println("please enter the new username:");
            Scanner user_onput = new Scanner(System.in);
            String username = user_onput.nextLine();
            System.out.println("please enter the new password:");
            Scanner pass_onput = new Scanner(System.in);
            String password = pass_onput.nextLine();




        }
    }


        }

public class Main {

    public static void main(String[] args) {

        //a harcoded, locally saving databse.

        System.out.println("what shop are you interested in?");
        Scanner shop1_input = new Scanner(System.in);
        String shop1_choice = shop1_input.nextLine();


        System.out.println("would you like to do" +
                "(1)Security" +
                "(2)table_info" +
                "(3)que info");
        Scanner input1 = new Scanner(System.in);
        int choice_1 = input1.nextInt();

        if(choice_1 == 1){
            SECURITY new_scurity = new SECURITY();
            new_scurity.add_details(shop1_choice);


        }


    }
}
