package com.company.dahms;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int lowTemp = 32;

        System.out.println(true | (lowTemp+=5) >0);
        System.out.println(lowTemp);

        int currentTemp = 3;
        int warmThreshold = 60;

        if (currentTemp >= warmThreshold){
            System.out.println("It's warm outside");
        } else {
            System.out.println("It's cold outside");
        }

        String windDirection = "West";

        switch(windDirection){
            case "North":
                System.out.println("The wind is blowing from the north"); break;
            case "South":
                System.out.println("The wind is blowing from the south"); break;
            case "East":
                System.out.println("The wind is blowing from the east"); break;
            case "West":
                System.out.println("The wind is blowing from the West"); break;
            default:
                System.out.println("I don't know which way the wind is blowing!"); break;
        }

        //Day 2

        int i = 0;

        while (i<10){
            i+=2;
            System.out.println(i);
        }

        for(i=0; i<=10; i+=2){
            System.out.println(i);
        }

        i=0;

        do{
            System.out.println(i);
            i+=2;
        }while (i<10);

        int[] integers = {1,2,3,4,-1,-2,10};

        for (i=0; i < integers.length; i++){
            if(integers[i]<0) {
                System.out.println(i);
            }
        }

        String name= "Simeon";
        System.out.println(name);
        name = name.substring(1, name.length()-1);
        System.out.println(name);

    }
}
