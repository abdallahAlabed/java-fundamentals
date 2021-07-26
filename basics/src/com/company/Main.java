package com.company;

import java.time.LocalDateTime;

public class Main {

    public static String pluralize(String word , int num ){

        if(num==1){
            return "I own " + num +" "+ word;
        }else{
            return "I own " + num +" "+ word+"s";
        }
    }

    public static void flipNHeads(int n){

        int headFlips = 0;

        int flipsCounts = 0;

        if(n <= 0){
            System.out.println("no flips possible");
            return;
        }

        while(headFlips !=n) {
            double random = Math.random();
            if (random < 0.5) {
                System.out.println("TAILS");
               headFlips = 0;
                flipsCounts++;
            }
            if (random >=0.5) {
                System.out.println("HEADS");
                headFlips++;
                flipsCounts++;
            }
        }
        System.out.println("It took " + flipsCounts + " flips to get " + n + " heads in a row.");
    }
    public static void clock(){
        int x =0;
        while (true){
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            if(x!=second){
                System.out.println(hour+": "+minute+" :"+second);
                x=second;
            }

        }
    }




    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println(pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println( pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println(pluralize("turtle", turtleCount) + ".");


        flipNHeads(1);

        clock();



    }

}
